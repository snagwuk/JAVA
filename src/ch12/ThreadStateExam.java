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

public class ThreadStateExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
