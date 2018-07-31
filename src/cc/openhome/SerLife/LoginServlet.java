package cc.openhome.SerLife;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/loginsd.do")
public class LoginServlet extends HttpServlet {

    private Map<String,String> users;

    public LoginServlet(){
        users = new HashMap<String,String>();
        users.put("caterpillar","123456");
        users.put("momor","98765");
        users.put("hamimi","13579");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("user");
        String passwd = request.getParameter("passwd");

        String page = "form.html";
        if(users.containsKey(name) && users.get(name).equals(passwd)){
            request.getSession().setAttribute("user",name);
            page = "welcome.view";
        }
        response.sendRedirect(page);
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
