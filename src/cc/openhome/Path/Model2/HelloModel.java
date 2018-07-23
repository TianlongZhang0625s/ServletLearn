package cc.openhome.Path.Model2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tianlong Zhang
 * @time 2018/7/23 7:58
 * @project FirstServlet
 * @Version 1.0.0
 */
public class HelloModel {
    private Map<String,String> messages = new HashMap<String, String>() ;
    public HelloModel(){
        messages.put("caterpillar","Hello");
        messages.put("Justin","Welcome");
        messages.put("momor","Hi");
    }

    public String doHello(String user){
        String message = messages.get(user);
        return message +" , "+ user + "!";
    }
}
