package cc.openhome.SerLife;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Tianlong Zhang
 * @time 2018/7/29 16:02
 * @project FirstServlet
 * @Version 1.0.0
 */
@WebListener
public class OnlineUserCounter implements HttpSessionListener {

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    public void sessionCreated(HttpSessionEvent sessionEvent){
        OnlineUserCounter.counter++;
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent){
        OnlineUserCounter.counter--;
    }
}
