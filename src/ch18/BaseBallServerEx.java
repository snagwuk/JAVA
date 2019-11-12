package ch18;


import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class BaseBallServerEx {
   ServerSocket server;
   final static int port = 5000;
   Socket client;
   Hashtable<String,ObjectOutputStream> hm;
   
   public BaseBallServerEx() {
      String data = "";
      System.out.println("**** 야구 게임 서버 ****");
      try
      {
         server = new ServerSocket(port);
      } catch(Exception e)
      {
         e.printStackTrace();
         System.exit(0);
      }
      hm = new Hashtable<String,ObjectOutputStream>();
      
      //숫자 정하기
      Set dset = new HashSet();
      Random r = new Random();
      while(true)
      {
         int num = r.nextInt(10);
         dset.add(num);
         if(dset.size() == 4)
            break;
      }
      
      StringBuffer sb = new StringBuffer();
      Iterator it = dset.iterator();
      
      while(it.hasNext())
      {
         sb.append(it.next());
      }
      
      data = sb.toString();
      System.out.println("숫자는:'"+data+"'입니다.");
      
      while(true)
      {
         try
         {
            System.out.println("서버는 클라이언트 소켓의 접속 요청을 기다리고 있음");
            client = server.accept();
            BaseBallServerThread childThread = new BaseBallServerThread(data, client, hm);
            Thread t = new Thread(childThread);
            t.start();
         } catch(Exception e)
         {
            e.printStackTrace();
            System.exit(0);
         }
      }
   }
   
   
   public static void main(String[] args) {
      new BaseBallServerEx();
   }
}