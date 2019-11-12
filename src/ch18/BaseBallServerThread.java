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
            System.out.println(client.getInetAddress() + "�κ��� ���� ��û ����");
            ois = new ObjectInputStream(client.getInputStream());
            oos = new ObjectOutputStream(client.getOutputStream());
            user_id = (String) ois.readObject();
            System.out.println("server : user_id = " + user_id);
            broadcast(user_id + "���� �����ϼ̽��ϴ�.");
            System.out.println("������ Ŭ���̾�Ʈ�� ���̵�� " + user_id + "�Դϴ�.");
            
            synchronized (hm)
            {
                hm.put(this.user_id, oos);
                System.out.println(hm.size() + " �� �Դϴ�.");
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
                // ���� �����ϱ�: �ݵ�� �� �ڸ� ���� �Է� �ʿ�
                if (receiveData.length() != 4)
                {
                    oos.writeObject("4 �ڸ� ���ڸ� �Է��ϼ���.");
                    continue;
                }
                
                // ���� ���ڴ� �� ��
                Set s = new HashSet();
                for (int i = 0; i < 4; i++)
                {
                    char c = receiveData.charAt(i);
                    
                    if (!s.add(c))
                    {
                        oos.writeObject("���� �ٸ� 4 ���� ���ڸ� �Է��ϼ���.");
                        break;
                    }
                }
                
                // ��Ʈ����ũ ����
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
                    broadcast(receiveData + "�����Դϴ�. " + user_id
                            + "���� �¸��Դϴ�. \n ������ �����մϴ�. �ȳ��� ���ʽÿ�.");
                    System.exit(0);
                }
                else
                {
                    oos.writeObject(receiveData + ":" + strike + "��Ʈ����ũ, "
                            + ball + "��");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ŭ���̾�Ʈ�� ���� ����");
        }
        
        finally
        {
            synchronized (hm)
            {
                hm.remove(user_id);
            }
            
            broadcast(user_id + "���� �����̽��ϴ�.");
            System.out.println(user_id + "���� �����̽��ϴ�.");
            
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
