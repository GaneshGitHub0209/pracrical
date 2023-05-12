import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AccessCounterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the session associated with the client
        HttpSession session = request.getSession(true);

        // Get the current count from the session
        Integer count = (Integer) session.getAttribute("count");

        // Increment the count
        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        // Update the count in the session
        session.setAttribute("count", count);

        // Set the response content type
        response.setContentType("text/html");

        // Create the response content
        response.getWriter().println("<h1>Access Counter</h1>");
        response.getWriter().println("<p>Number of times you have accessed this page: " + count + "</p>");
    }
