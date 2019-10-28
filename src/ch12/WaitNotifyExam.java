package ch12;
class ThreadC extends Thread
{
    private WorkObject workObject;
    ThreadC(WorkObject workObject)
    {
        this.workObject = workObject;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 0 ; i <10; i++)
        {
            workObject.methodC();
        }
    }
}
class ThreadD extends Thread
{
    private WorkObject workObject;
    ThreadD(WorkObject workObject)
    {
        this.workObject = workObject;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 0 ; i <10; i++)
        {
            workObject.methodD();
        }
    }
}

class WorkObject
{
    public synchronized void methodC()
    {
        // TODO Auto-generated method stub
        System.out.println("ThreadC�� methodC() �۾� ���� ");
        notify();
        try
        {
            wait();
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
    }
    
    public synchronized void methodD()
    {
        // TODO Auto-generated method stub
        System.out.println("ThreadD�� methodD() �۾� ���� ");
        notify();
        try
        {
            wait();
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
    }

   
    
}

public class WaitNotifyExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
      WorkObject so = new WorkObject();
      
      ThreadC threadc = new ThreadC(so);    
      ThreadD threadd = new ThreadD(so);    
      
      threadc.start();
      threadd.start();
    }
    
}
