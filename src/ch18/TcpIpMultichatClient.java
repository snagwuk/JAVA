package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultichatClient
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String name = "★★★★";
        String serverIp = "211.63.89.97";
        try
        {
            Socket socket = new Socket(serverIp, 7777);
            System.out.println("서버에 연결 되었습니다.");
            Thread sender = new Thread(new ClientSender(socket, name));
            Thread receiver = new Thread(new ClientReceiver(socket));
            sender.start();
            receiver.start();
        }
        catch (ConnectException e)
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

class ClientSender extends Thread
{
    Socket socket;
    
    DataOutputStream out;
    
    String name;
    
    public ClientSender(Socket socket, String name)
    {
        this.socket = socket;
        try
        {
            out = new DataOutputStream(socket.getOutputStream());
            this.name = name;
            
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
    
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            if (out != null) out.writeUTF(name);
            
            while (out != null)
            {
                out.writeUTF("["+name+"]" + sc.nextLine());
            }
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

class ClientReceiver extends Thread
{
    Socket socket;
    
    DataInputStream in;
    
    public ClientReceiver(Socket socket)
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
            catch (IOException e)
            {
                // TODO: handle exception
            }
        }
    }
}
