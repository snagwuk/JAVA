package ch12;

import java.awt.Toolkit;

public class BeepPrintExam
{
    
    public static void main(String[] args)
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
        for(int i = 0; i < 5; i ++)
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
