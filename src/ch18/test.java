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
            
            // ������ �����Ͽ� ������ ��û�Ѵ�.
            Socket socket = new Socket(serverIp, 7777);
            System.out.println("������ ����Ǿ����ϴ�.");
            
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
