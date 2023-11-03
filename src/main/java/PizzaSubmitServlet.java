import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "/PizzaSubmitServlet", urlPatterns = "/pizza-order")
public class PizzaSubmitServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + Arrays.toString(toppings));
        System.out.println("Address: " + address);

        request.setAttribute("crust", crust);
        request.setAttribute("sauce", sauce);
        request.setAttribute("size", size);
        request.setAttribute("toppings", toppings);
        request.setAttribute("address", address);

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

}
