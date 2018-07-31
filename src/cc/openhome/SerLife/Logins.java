package cc.openhome.SerLife;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Logins",
urlPatterns = {"/logins.do"},
initParams = {
        @WebInitParam(name="SUCCESS" ,value = "success.jsp"),
        @WebInitParam(name = "ERROR",value = "faliure.jsp")
})
public class Logins extends HttpServlet {
    private String SUCESS_VIEW;
    private String ERROR_VIEW;

    public void init() throws ServletException{
        SUCESS_VIEW = getInitParameter("SUCCESS");
        ERROR_VIEW = getInitParameter("ERROR");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        if("caterpillar".equals(name) && "123456".equals(passwd)){
            request.getRequestDispatcher(SUCESS_VIEW).forward(request,response);
        }else {
            request.getRequestDispatcher(ERROR_VIEW).forward(request,response);
        }
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
