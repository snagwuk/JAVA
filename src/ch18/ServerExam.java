package ch18;

import java.io.IOException;
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
                System.out.println("[연결 수락]" + isa.getHostName());
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
