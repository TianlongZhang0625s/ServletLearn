package cc.openhome.SerLife.SessionLis;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author Tianlong Zhang
 * @time 2018/7/30 22:05
 * @project FirstServlet
 * @Version 1.0.0
 */
public class User implements HttpSessionBindingListener {

    private String name;
    private String data;
    public User(String name){
        this.name = name;
    }

    public void valueBound(HttpSessionBindingEvent event){
        this.data = name + "来自数据库``````";
    }

    public void valueUnbound(HttpSessionBindingEvent event){

    }

    public String getData() {
        return data;
    }

    public String getName(){
        return name;
    }
}
