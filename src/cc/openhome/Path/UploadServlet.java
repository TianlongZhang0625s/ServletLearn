package cc.openhome.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求body
        byte[] body = readBody(request);

        String textBody = new String(body,"iso-8859-1");

        String filename = getFilename(textBody);

        Position p = getFilePosition(request,textBody);

        writeTo(filename,body,p);
    }

    class Position {
        int begin;
        int end;
        Position(int begin,int end){
            this.begin = begin;
            this.end = end;
        }

    }

    private byte[] readBody(HttpServletRequest request) throws IOException{
        int formDataLength = request.getContentLength();
        DataInputStream dataInputStream =
                new DataInputStream(request.getInputStream());
        byte body[]  = new byte[formDataLength];
        int totalBytes = 0;
        while (totalBytes < formDataLength){
            int bytes = dataInputStream.read(body,totalBytes,formDataLength);
            totalBytes += bytes;
        }
        return body;
    }

    private String getFilename(String rrequestBody){
        String filename = rrequestBody.substring(rrequestBody.indexOf("filename=\"") + 10);
        filename= filename.substring(0,filename.indexOf("\n"));
        filename = filename.substring(filename.lastIndexOf("\\") + 1,filename.indexOf("\""));
        return filename;
    }

    private Position getFilePosition(HttpServletRequest request,String textBody) throws IOException{
        String contentType = request.getContentType();
        System.out.println(contentType);
        String boundryText = contentType.substring(contentType.lastIndexOf("=") + 1,contentType.length());

        int pos = textBody.indexOf("filename=\"");
        System.out.println(pos);
        System.out.println(textBody);
        pos = textBody.indexOf("\n",pos) + 1;
        pos = textBody.indexOf("\n",pos) + 1;
        pos = textBody.indexOf("\n" , pos) + 1;

        int buundryLoc = textBody.indexOf(boundryText,pos) - 4;
        System.out.println(textBody.substring(buundryLoc,buundryLoc + 8));
        int begin = ((textBody.substring(0,pos)).getBytes("iso-8859-1")).length;
        int end = ((textBody.substring(0,buundryLoc)).getBytes("iso-8859-1")).length;
        return new Position(begin,end);
    }

    private void writeTo(String filename,byte[] body,Position p) throws FileNotFoundException,IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("F:/" + filename);
        fileOutputStream.write(body,p.begin,(p.end - p.begin));
        fileOutputStream.flush();
        fileOutputStream.close();
    }
/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
