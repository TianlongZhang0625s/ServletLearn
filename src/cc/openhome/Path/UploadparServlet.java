package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
@MultipartConfig
@WebServlet("/part.view")
public class UploadparServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part part = request.getPart("photo");
        String filename = getFilename(part);
        request.getParts();
        System.out.println("filename :::" + filename);
        wirteTo(filename,part);

    }

    private String getFilename(Part part){
        String head = part.getHeader("Content-Disposition");
        String filename = head.substring(head.indexOf("filename=\"") + 10, head.lastIndexOf("\""));
        return filename;
    }

    private void wirteTo(String filename, Part part) throws IOException,FileNotFoundException{
        InputStream in = part.getInputStream();
        OutputStream out = new FileOutputStream("F:/"+filename);
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = in.read(buffer)) != -1){
            out.write(buffer,0,length);
        }
        in.close();
        out.close();
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
