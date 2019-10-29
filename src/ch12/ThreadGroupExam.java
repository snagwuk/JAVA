package ch12;

public class ThreadGroupExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ThreadGroup mygroup = new ThreadGroup("myGroup");
       
        WorkThread workThreadA = new WorkThread(mygroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(mygroup, "workThreadB");
        workThreadA.start();
        workThreadB.start();
        
        System.out.println("[ main ������ �׷���  list() �޼ҵ� ��� ����]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            // TODO: handle exception
            
        }
        System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ��]");
        mygroup.interrupt();
        
    }
    
}
class WorkThread extends Thread
{ 
     WorkThread(ThreadGroup threadgroup , String threadName)
    {
        super(threadgroup,threadName);
    }
     @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(true)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + " �����");
    }
}

