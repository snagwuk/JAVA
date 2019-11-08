package ch18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer implements Runnable
{
    ServerSocket serverSocket;
    Thread[] threadArr;
    
    public TcpIpServer(int i)
    {
        // TODO Auto-generated constructor stub
        try
        {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "서버작 준비되었습니다.");
            threadArr = new Thread[i];
        }
        catch (IOException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println(getTime() + "가 연결요청을 기다립니다.");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + " 로 부터 연결요청이 들어왔습니다.");
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);
                dos.writeUTF("[Notice] Test Message1 from server");
                System.out.println(getTime() + "데이터를 전송했습니다.");
                dos.close(); socket.close();
            }
            catch (IOException e)
            {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    
    static String getTime()
    {
        // TODO Auto-generated method stub
        String name = Thread.currentThread().getName();
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date()) + name;
    }
    public void start()
    {
        for(int i = 0 ; i < threadArr.length; i++)
        {
            threadArr[i] = new Thread(this);
            threadArr[i]. start();
        }
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TcpIpServer server = new TcpIpServer(5);
        server.start();
    }
    
    
}
