import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;

//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
//public class HelloWorldServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//        String name = req.getParameter("name");
//        System.out.println("the parameter in our url said: " + name);
//
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.println("<h1>Hello Fenrir!</h1");
//        out.println("<h3>Happy Halloween!</h3>");
//        out.println("<form method=\"POST\" action=\"/register\">\n" +
//                "    <label for=\"email\">Email:</label>\n" +
//                "    <input id=\"email\" name=\"email\" placeholder=\"Enter your email address\" />\n" +
//                "</form>\n")
//
//    }
//}

//---------------------------Question 2---------------------------------

//        Create a page that displays "Hello World!" when a user visits /hello

//the @WEbServlet is what points the url to the right page that you have set up through the backend
@WebServlet(name= "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //this prints put the query that is shown in the terminal
        String name = req.getParameter("name");
        if (name == null) {
            name = "World";
        }
        System.out.println("the parameter in our url said: " + name);

        //this is what displays the text on the webpage
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello " + name + "!</h1>");
=======

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
>>>>>>> jdbc-exercise
    }
}
