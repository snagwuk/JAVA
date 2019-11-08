package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient5
{
    
    public static void main(String[] args)
    {
        try
        {
            String serverIp = "211.63.89.95";
            
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

class Sender extends Thread
{
    Socket socket;
    
    DataOutputStream out;
    
    String name;
    
    public Sender(Socket socket)
    {
        this.socket = socket;
        try
        {
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
            
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
    
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        while (out != null)
        {
            try
            {
                out.writeUTF(name + sc.nextLine());
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}

class Receiver extends Thread
{
    Socket socket;
    
    DataInputStream in;
    
    public Receiver(Socket socket)
    {
        this.socket = socket;
        try
        {
            in = new DataInputStream(socket.getInputStream());
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
    
    public void run()
    {
        
        while (in != null)
        {
            try
            {
                System.out.println(in.readUTF());
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}
