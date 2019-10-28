package ch12;

import java.awt.Toolkit;

public class BeepPrintExam3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                Toolkit tk = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i ++)
                {
                    tk.beep();
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
        };
        
        //Thread thread = new BeepTaskZ();
        thread.start();
        for(int i = 0 ; i < 5 ; i ++)
        {
            System.out.println("¶ò");
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
class BeepTaskZ extends Thread
{
   
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        Toolkit tk = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i ++)
        {
            tk.beep();
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
