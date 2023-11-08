import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;

@WebServlet(name= "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    protected int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        count++;
        //this is what displays the text on the webpage
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Number of times visited:  " + count + "</h1>");
        out.println("<button type=\"refresh\">refresh\n" +
                "</button>\n");
=======

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1;
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
>>>>>>> jdbc-exercise
    }
}
