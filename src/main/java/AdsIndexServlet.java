import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
        try {
            request.setAttribute("ads", DaoFactory.getAdsDao().all());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
=======

        HttpSession session = request.getSession();
        if(session.getAttribute("favColor")== null){
            request.setAttribute("favColor", "transparent");
        } else{
            request.setAttribute("favColor", session.getAttribute("favColor"));
        }

        request.setAttribute("ads", DaoFactory.getAdsDao().all());
>>>>>>> sessions-and-cookies-exercise
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
