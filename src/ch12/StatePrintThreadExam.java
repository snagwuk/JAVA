package ch12;

import java.awt.Toolkit;

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
        Toolkit tk = Toolkit.getDefaultToolkit();
        for(int i = 0 ; i < 10; i ++)
        {
            tk.beep();
            try
            {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
    
}
