package cc.openhome.Path;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/some.view")
public class DisparServlet extends HttpServlet {
/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Some do one ``````");
        RequestDispatcher dispatcher = request.getRequestDispatcher("other.view?data=123456");
        dispatcher.include(request,response);
        out.println("Some do two ``````");
        out.close();

    }
}
