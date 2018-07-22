package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet( "/header.view")
public class HeaderServlet extends HttpServlet {
/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out  = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> HeadServlet </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> HeadServlet at" + request.getContextPath() + "</h1>");
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            out.println(name + " : " + request.getHeader(name) + "<br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
