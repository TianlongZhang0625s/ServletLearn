package cc.openhome.Path.Model2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello.views")
public class HelloView extends HttpServlet {
/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

private String hmlTemplete = "<html>"
        +  "<head>"
        +  " <meta http-equiv='Content-type' " +
        "  content='text/html;charset=UTF-8'>"
        + "<title>%s</title>"
        + "</head>"
        +  "<body>"
        +  "<h1> %s </h1>"
        +  "</body>"
        +  "</html>";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String  user = request.getParameter("user");
        String message =(String) request.getAttribute("message");
        String html = String.format(hmlTemplete,user,message);
        response.getWriter().println(html);
    }
}
