package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello.view")
public class HelloServlet extends HttpServlet {
/*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String names = new String(name.getBytes("ISO-8859-1"),"utf-8");

        out.println("<html>");
        out.println("<head>");
        out.println("<title> hello servlet </title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1> hello" + names + " !</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
