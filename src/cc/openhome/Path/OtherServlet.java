package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/other.view")
public class OtherServlet extends HttpServlet {
/*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println(request.getParameter("data"));
        out.println("Other do one ``````");
    }
}
