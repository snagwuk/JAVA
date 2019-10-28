package ch12;

import java.awt.Toolkit;

public class BeepPrintExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
       /* how1
        * Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);*/
        /*Thread thread = new Thread(new Runnable() {
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
        });*/
        // ���ٽ� ��� ���
        Thread thread = new Thread(() -> 
        {
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
        });
        thread.start();
        for(int i = 0 ; i < 5 ; i ++)
        {
            System.out.println("��");
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
class BeepTask implements Runnable
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