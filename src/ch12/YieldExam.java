package ch12;
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
        
    }
    
}
