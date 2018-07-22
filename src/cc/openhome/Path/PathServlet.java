package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/servlet")
public class PathServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        if(name.equals("cate") && pass.equals("123456")){
            request.getRequestDispatcher("sucess.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("faliure.jsp").forward(request,response);
        }

    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

        out.println("<html>");
        out.println("<head>");
        out.println("<title> hello servlet </title>");
        out.println("</head>");
        out.println("<body>");
        out.println( new Date().toString() + "<br>");
        out.println( request.getRemoteAddr()+ "<br>");
        out.println(request.getRemoteAddr() + ":" +request.getRemotePort() + request.getRequestURI() + "<br>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }*/
}
