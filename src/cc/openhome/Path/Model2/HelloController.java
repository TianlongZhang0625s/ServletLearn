package cc.openhome.Path.Model2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello.do")
public class HelloController extends HttpServlet {

    private HelloModel helloModel = new HelloModel();
/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("user");
        String message = helloModel.doHello(name);
        request.setAttribute("message",message);
        request.getRequestDispatcher("hello.views").forward(request,response);
    }
}
