package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail", "ȫ�浿"));
        messageQueue.offer(new Message("sendSMS", "�ſ��"));
        messageQueue.offer(new Message("sendKakaotalk", "ȫ�β�"));
        
        while(!messageQueue.isEmpty())
        {
            Message m = messageQueue.poll();
            switch(m.command)
            {
                case "sendMail": 
                    System.out.println(m.to + "�Կ��� ������ �����ϴ�.");
                    break;
                case "sendSMS" : 
                    System.out.println(m.to + "�Կ��� SMS �����ϴ�.");
                    break;
                case "sendKakaotalk" : 
                    System.out.println(m.to + "�Կ��� ī�� �����ϴ�.");
                    break;
            }
        }
    }
    
}
class Message
{
    String command;
    String to;
    public Message(String command, String to)
    {
        super();
        this.command = command;
        this.to = to;
    }
    
}
