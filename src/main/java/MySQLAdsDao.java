import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//need to implement ADsDao
public class MySQLAdsDao implements Ads{
    //    Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            //    This class should have a private instance property named connection of type Connection that is initialized in the constructor.
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            throw new RuntimeException("ERROR! Cannot access the database!", e);
        }
    }


    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> arrayList= new ArrayList<>();
        //This method needs to:
        //Talk to MySQL. . SELECT * from ads; (get all the ads)
        String selectQuery = "SELECT * FROM ads";
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            //Bring that back into Java as a List<Ad> adsList < example
            while (rs.next()) {
                arrayList.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return arrayList;

        //return list of ads

//        So you have a while loop >
//                In the while loop, could you build Ad objects one by one then add them to a List of Ad object
//        while (resultSet.next()){
//        Make an ad object with “title” and “description” from the database
//        Add finished object to a List<Ad> myListOfAds
//    }
//        return myListOfAds;

    }

    @Override
    public Long insert(Ad ad) {
        //Bring in this ad object as an argument
        //Set up a MySQL insert statement in Java
        //Send that to the  database (INSERT INTO ads . . . VALUES . . .)
        //Return

        //putting the info that is grabbed from mySQL database and assigning a variable
        String addTitle = ad.getTitle();
        String addDescription = ad.getDescription();
        long userID = ad.getUserId();

        String insertStmt = "INSERT INTO ads (user_id, title, description) Values (" + userID + " , '" + addTitle + "' , '" + addDescription + "'"+ ")";

        try {
            Statement statement = connection.createStatement();
            statement.execute(insertStmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    Implement the methods in the AdsDao interface
//    Your methods should retrieve ads from the database and insert new ads into the database
}
