import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bonjour</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Georges Faysal</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}