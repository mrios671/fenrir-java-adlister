import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="/ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String color = (String) session.getAttribute("color");
        request.setAttribute("color", color);
        RequestDispatcher view = request.getRequestDispatcher("viewcolor.jsp");
        view.forward(request, response);
    }
}
