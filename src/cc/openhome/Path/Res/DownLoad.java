package cc.openhome.Path.Res;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/download.do")
public class DownLoad extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String passwd = request.getParameter("passwd");
        if("123456".equals(passwd)){
            response.setContentType("application/pdf");
            InputStream in = getServletContext().getResourceAsStream(
                    "OperationSystem.pdf"
            );
            OutputStream outputStream = response.getOutputStream();
            writeBytes(in,outputStream);
        }

    }


    private void writeBytes(InputStream in ,OutputStream out) throws IOException{

        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = in.read(buffer)) != -1){
            out.write(buffer,0,length);
        }

        in.close();
        out.close();
    }
 /*   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
