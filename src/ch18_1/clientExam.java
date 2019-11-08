package ch18_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class clientExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
     // TODO Auto-generated method stub
        Socket socket = null;
        try
        {
            System.out.println("[연결 요청]");
            //socket = new Socket("211.63.89.98",5001);
            socket = new Socket("211.63.89.91",5001);
            System.out.println("[연결 성공]");
            byte[] bytes = null;
            String message = null;
            OutputStream os = socket.getOutputStream();
            message = "Hello Server-98";
            bytes = message.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 보내기 성공]");
                    
            InputStream is =socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes, 0 , readByteCount, "UTF-8");
            System.out.println("[데이터 받기 성공] : " + message);
            os.close();
            is.close();
            
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        if(!socket.isClosed())
        {
            try
            {
                socket.close();
            }
            catch (IOException e)
            {
                // TODO: handle exception
            }
        }
    }
    
}
