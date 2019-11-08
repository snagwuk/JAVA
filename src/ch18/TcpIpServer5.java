package ch18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer5
{
    
    public static void main(String[] args)
    {
        ServerSocket serversocket = null;
        Socket socket = null;
        
        // TODO Auto-generated method stub
        try
        {
            serversocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");
            socket = serversocket.accept();
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);
            sender.start();
            receiver.start();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
                }
    
}
