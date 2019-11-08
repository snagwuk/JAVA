package ch18;

import java.net.ConnectException;
import java.net.Socket;

public class test
{
    public static void main(String[] args)
    {
        try
        {
            String serverIp = "211.63.89.97";
            
            // 소켓을 생성하여 연결을 요청한다.
            Socket socket = new Socket(serverIp, 7777);
            System.out.println("서버에 연결되었습니다.");
            
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);
            sender.start();
            receiver.start();
        }
        catch (ConnectException ce)
        {
            ce.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
