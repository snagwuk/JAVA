package ch18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class BaseBallServerThread implements Runnable
{
    Socket client;
    
    ObjectInputStream ois;
    
    ObjectOutputStream oos;
    
    String user_id;
    
    String data;
    
    Hashtable<String, ObjectOutputStream> hm;
    
    public BaseBallServerThread(String data, Socket s, Hashtable hm)
    {
        this.data = data;
        client = s;
        this.hm = hm;
        
        try
        {
            System.out.println(client.getInetAddress() + "로부터 연결 요청 받음");
            ois = new ObjectInputStream(client.getInputStream());
            oos = new ObjectOutputStream(client.getOutputStream());
            user_id = (String) ois.readObject();
            System.out.println("server : user_id = " + user_id);
            broadcast(user_id + "님이 접속하셨습니다.");
            System.out.println("접속한 클라이언트의 아이디는 " + user_id + "입니다.");
            
            synchronized (hm)
            {
                hm.put(this.user_id, oos);
                System.out.println(hm.size() + " 명 입니다.");
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void run()
    {
        String receiveData;
        try
        {
            while (true)
            {
                receiveData = (String) ois.readObject();
                // 숫자 검증하기: 반드시 네 자리 수만 입력 필요
                if (receiveData.length() != 4)
                {
                    oos.writeObject("4 자리 숫자를 입력하세요.");
                    continue;
                }
                
                // 같은 숫자는 안 됨
                Set s = new HashSet();
                for (int i = 0; i < 4; i++)
                {
                    char c = receiveData.charAt(i);
                    
                    if (!s.add(c))
                    {
                        oos.writeObject("서로 다른 4 개의 숫자를 입력하세요.");
                        break;
                    }
                }
                
                // 스트라이크 검증
                int strike = 0;
                int ball = 0;
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        if (receiveData.charAt(i) == data.charAt(j))
                        {
                            if (i == j)
                                strike++;
                            else
                                ball++;
                        }
                    }
                }
                if (strike == 4)
                {
                    broadcast(receiveData + "정답입니다. " + user_id
                            + "님이 승리입니다. \n 게임을 종료합니다. 안녕히 가십시오.");
                    System.exit(0);
                }
                else
                {
                    oos.writeObject(receiveData + ":" + strike + "스트라이크, "
                            + ball + "볼");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("클라이언트가 강제 종료");
        }
        
        finally
        {
            synchronized (hm)
            {
                hm.remove(user_id);
            }
            
            broadcast(user_id + "님이 나가셨습니다.");
            System.out.println(user_id + "님이 나가셨습니다.");
            
            try
            {
                if (client != null) client.close();
            }
            catch (Exception e)
            {
            }
        }
    }
    
    public void broadcast(String message)
    {
        synchronized (hm)
        {
            try
            {
                for (ObjectOutputStream oos : hm.values())
                {
                    oos.writeObject(message);
                    oos.flush();
                }
            }
            catch (IOException e)
            {
            }
        }
    }
}
