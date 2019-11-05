package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail", "È«±æµ¿"));
        messageQueue.offer(new Message("sendSMS", "½Å¿ë±Ç"));
        messageQueue.offer(new Message("sendKakaotalk", "È«µÎ²²"));
        
        while(!messageQueue.isEmpty())
        {
            Message m = messageQueue.poll();
            switch(m.command)
            {
                case "sendMail": 
                    System.out.println(m.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
                    break;
                case "sendSMS" : 
                    System.out.println(m.to + "´Ô¿¡°Ô SMS º¸³À´Ï´Ù.");
                    break;
                case "sendKakaotalk" : 
                    System.out.println(m.to + "´Ô¿¡°Ô Ä«Åå º¸³À´Ï´Ù.");
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
