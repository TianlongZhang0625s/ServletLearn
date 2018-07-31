package cc.openhome.SerLife;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/avatar.view"}
/*initParams = {
        @WebInitParam(name="AVATAR_DIR", value = "/")
}*/)
public class Avatars extends HttpServlet {

    private String AVATAR_DIR;

    public void init() throws ServletException{
        AVATAR_DIR = (String) getServletContext().getAttribute("avatars");
    }

/*    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title> 头像显示</title>");
        out.println("</head>");
        out.println("<body>");
        for (String avatar : getServletContext().getResourcePaths(AVATAR_DIR)
             ) {
            avatar = avatar.replaceFirst("/","");
            out.println("<li> " + avatar + "</li>");
        }

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
