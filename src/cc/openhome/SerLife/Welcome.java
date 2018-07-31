package cc.openhome.SerLife;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome.view")
public class Welcome extends HttpServlet {
/*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>欢迎</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> 目前在线人数  " +
        OnlineUserCounter.getCounter() + "  人 </h1>");
        if(session != null){
            String user = (String) session.getAttribute("user");
            out.println("<h1> 欢迎：" + user + " </h1>");
            out.println("<a href = 'logouts.do' > 注销</a>");
        }

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
