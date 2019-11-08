package ch18;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            String serverIp = "211.63.89.98";
            System.out.println("서버에 연결중입니다. 서버IP : "+ serverIp);
            
            Socket socket = new Socket(serverIp,7777);
            InputStream in =  socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
            System.out.println("연결을 종료합니다.");
            
            dis.close();
            socket.close();
            System.out.println("연결종료.");
        }
        catch (ConnectException e)
        {
            // TODO: handle exception
            e.printStackTrace();
            
        }
        catch (IOException e)
        {
            // TODO: handle exception
            e.printStackTrace();
            
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
            
        }
    }
    
}
