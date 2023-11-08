import java.sql.*;
import java.util.List;

//need to implement ADsDao
public class MySQLAdsDao implements Ads{
    //    Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
    Config config = new  Config();
    //    This class should have a private instance property named connection of type Connection that is initialized in the constructor.
    Connection connection = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword()
    );

    @Override
    public List<Ad> all() throws SQLException {

        //This method needs to:
        //Talk to MySQL. . SELECT * from ads; (get all the ads)
        String selectQuery = "SELECT * FROM ads";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);
        //Bring that back into Java as a List<Ad> adsList < example
        while (rs.next()) {
            System.out.println("Title; " + rs.getString("title"));
            System.out.println(rs.getString("description"));

            new Ad(
               rs.getString("title"),
               rs.getString("description")
            );

        }
        //return list of ads

//        So you have a while loop >
//                In the while loop, could you build Ad objects one by one then add them to a List of Ad object
//        while (resultSet.next()){
//        Make an ad object with “title” and “description” from the database
//        Add finished object to a List<Ad> myListOfAds
//    }
//        return myListOfAds;

        return ;
    }

    @Override
    public Long insert(Ad ad) {
        //Bring in this ad object as an argument
        //Set up a MySQL insert statement in Java
        //Send that to the  database (INSERT INTO ads . . . VALUES . . .)
        //Return
        return null;
    }

//    Implement the methods in the AdsDao interface
//    Your methods should retrieve ads from the database and insert new ads into the database
}
