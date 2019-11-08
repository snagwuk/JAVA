package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultichatServer
{
    HashMap clients;
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        new TcpIpMultichatServer().start();
    }
    void start()
    {
        // TODO Auto-generated method stub
        ServerSocket serversocket = null;
        Socket socket = null;
        
        try
        {
            serversocket = new ServerSocket(7777);
            System.out.println("서버가 시작되었습니다.");
           while(true)
           {
               socket = serversocket.accept();
               System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에서 접속하였습니다." );
               ServerReceiver thread = new ServerReceiver(socket);
               thread.start();
           }
           
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
    void sendToAll(String msg)
    {
        Iterator it = clients.keySet().iterator();
        while(it.hasNext())
        {
            try
            {
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(msg);
            }
            catch (IOException e)
            {
                // TODO: handle exception
            }
        }
    }
    TcpIpMultichatServer()
    {
        clients = new HashMap();
        Collections.synchronizedMap(clients);    
    }
    
    class ServerReceiver extends Thread
    {
        Socket socket;
        
        DataInputStream in;
        DataOutputStream out;
        ServerReceiver(  Socket socket)
        {
            this.socket = socket;
            try
            {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            }
            catch (IOException e)
            {
                // TODO: handle exception
            }
        }
        @Override
        public void run()
        {
            // TODO Auto-generated method stub
            String name = "";
            try
            {
                name = in.readUTF();
                sendToAll("#" + name + " 님이 입장!");
                clients.put(name,out);
                System.out.println("현재 서버 접속자 수 : " + clients.size());
                while(in != null)
                {
                    sendToAll(in.readUTF());
                }
            } catch (IOException e)
            {
                // TODO: handle exception
            }
            finally {
                sendToAll("#" + name + " 님이 퇴장.");
                clients.remove(name);
                System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에서 접속종료"  );
                System.out.println("현재 서버 접속자 수 : " + clients.size());
                
            }
        }
    }
    
}
