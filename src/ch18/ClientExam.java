package ch18;

import java.io.IOException;
import java.net.Socket;

public class ClientExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Socket socket = null;
        try
        {
            System.out.println("[���� ��û]");
            //socket = new Socket("211.63.89.98",5001);
            socket = new Socket("211.63.89.68",5001);
            System.out.println("[���� ����]");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println("�������");
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
