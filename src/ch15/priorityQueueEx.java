package ch15;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueEx
{
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Queue pq = new PriorityQueue();
        pq.offer(3); //�ڵ� �ڽ� new Integer(3)
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        Object obj = null;
        while((obj = pq.poll())!=null)
            System.out.println(obj);
    }
    
}