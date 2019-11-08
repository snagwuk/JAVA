package ch18_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ServerSocket serverSocket = null;
        try
        {
            serverSocket = new ServerSocket(5001);
            while(true)
            {
                System.out.println("[연결 대기]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
                System.out.println("->" + isa.getHostName());
                byte[] bytes = null;
                String message = null;
                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, "UTF-8");
                System.out.println("->" + message);
                OutputStream os = socket.getOutputStream();
                message = "Hello Client";
                bytes = message.getBytes("UTF-8");
               os.write(bytes);
               os.flush();
               System.out.println("[데이터 보내기 성공]");
               is.close(); os.close(); socket.close();
            }
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        if(!serverSocket.isClosed())
        {
            try
            {
                serverSocket.close();
            }
            catch (IOException e)
            {
                // TODO: handle exception
            }
        }
    }
    
}
