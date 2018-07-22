package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/body.view")
public class BodyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String body = readBody(request);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> hello servlet </title>");
        out.println("</head>");
        out.println("<body>");
        out.println(body);
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

    private String readBody(HttpServletRequest request) throws IOException{
        BufferedReader reader = request.getReader();
        String input = null;
        String requestBody = "";
        while ((input = reader.readLine()) != null){
            requestBody = requestBody + input + "<br>";
        }
        return requestBody;
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
