package cc.openhome.SerLife;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Tianlong Zhang
 * @time 2018/7/29 15:11
 * @project FirstServlet
 * @Version 1.0.0
 */

@WebListener
public class ContextParameterReader  implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent){
        ServletContext context = servletContextEvent.getServletContext();
        String acatars = context.getInitParameter("AVATAR_DIR");
         context.setAttribute("avatars",acatars);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent){

    }
}
