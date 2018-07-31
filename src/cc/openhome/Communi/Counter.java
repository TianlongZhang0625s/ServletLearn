package cc.openhome.Communi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/counter")
public class Counter extends HttpServlet {
/*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int count = 0;
        HttpSession session = request.getSession();

        if(session.getAttribute("count") != null){
            Integer c = (Integer)session.getAttribute("count");
            count = c +1 ;


        }

        session.setAttribute("count",count);
        out.println("<html>");
        out.println("<title>Servlet Counter</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Servlet count " + count + "</h1>");
        out.println("<a href = '" + response.encodeURL("counter") + " ' > 递增</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
