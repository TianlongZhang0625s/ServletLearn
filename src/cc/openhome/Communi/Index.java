package cc.openhome.Communi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index.do")
/*@WebServlet("/login.do")*/
public class Index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies
                 ) {
                String name = cookie.getName();
                String value = cookie.getValue();
                if("user".equals(name) && "caterpillar".equals(value)){
                    request.setAttribute(name,value);
                    request.getRequestDispatcher("/user.view").forward(request,response);
                    return;
                }
            }
        }

        response.sendRedirect("login.html");
    }
}