package ch18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx1
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        ServerSocket server = new ServerSocket(9000);
        
        while (true)
        {
            System.out.println("ㅡㅡㅡㅡㅡ클라이언트접속대기ㅡㅡㅡㅡㅡ");
            Socket clinet = server.accept();
            System.out.println("===============ok");
            HttpThread ht = new HttpThread(clinet);
            ht.start();
        }
    }
    
    static class HttpThread extends Thread
    {
        private Socket client;
        
        BufferedReader br;
        
        PrintWriter pw;
        
        public HttpThread(Socket client)
        {
            this.client = client;
            try
            {
                br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                pw = new PrintWriter(client.getOutputStream());
                
            }
            catch (IOException e)
            {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        
        public void run()
        {
            BufferedReader fbr = null;
            try
            {
                String line = br.readLine();
                String filename = "index2.html";
                fbr = new BufferedReader(new FileReader(filename));
                System.out.println(filename);
                String fline = null;
                
                
                pw.println("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
                while ((fline = fbr.readLine()) != null)
                {
                    pw.println(fline);
                    pw.flush();
                }
            }
            catch (IOException e)
            {
                // TODO: handle exception
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    if (fbr != null) 
                        fbr.close();
                    if (br != null) 
                        br.close();
                    if (pw != null) 
                        pw.close();
                    if (client != null)
                        client.close();
                }
                catch (IOException e2)
                {
                    // TODO: handle exception
                }
            }
        }
        
    }
    
}
