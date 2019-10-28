package ch12;

class TargetThread extends Thread
{
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (long i = 0; i < 1000000000; i++)
        {
        }
        try
        {
            Thread.sleep(1500);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        for (long i = 0; i < 1000000000; i++)
        {
            
        }
        
    }
}

class StatePrintThread extends Thread
{
    private Thread targetThread;
    StatePrintThread(Thread targetThread)
    {
        this.targetThread =targetThread;
    }
    @Override
    public void run()
    {
            // TODO Auto-generated method stub
        while (true)
        {
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드 상태 : " + state);
            if(state == Thread.State.NEW)
                targetThread.start();
            if(state == Thread.State.TERMINATED)
                break;
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
        
    }
}
public class StatePrintThreadExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
      StatePrintThread st = new StatePrintThread(new TargetThread());
      st.start();
    }
    
}
