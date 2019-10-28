package ch12;

import javax.xml.stream.events.StartDocument;

class ThreadAA extends Thread
{
    boolean stop = false;
    boolean work = true;
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(!stop)
        {
            if(work)
                System.out.println("ThreadAA �۾�����");
            else
                Thread.yield();
        }
        System.out.println("ThreadAA ����");
    }
}
class ThreadBB extends Thread
{
    boolean stop = false;
    boolean work = true;
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(!stop)
        {
            if(work)
                System.out.println("ThreadBB �۾�����");
            else
                Thread.yield();
        }
        System.out.println("ThreadBB ����");
    }
}
public class YieldExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ThreadAA threadAA = new ThreadAA();
        ThreadBB threadBB = new ThreadBB();
        threadAA.start();
        threadBB.start();
        
        try
        {
            Thread.sleep(30);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        threadAA.work = false;
        try
        {
            Thread.sleep(30);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        threadAA.work = true;
        
        try
        {
            Thread.sleep(30);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        threadAA.stop = true;
        threadBB.stop = true;
    }
    
}
