package ch12;

public class InterruptExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Thread thread = new printThread2();
        thread.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
        thread.interrupt();
    }
    
}
class printThread2 extends Thread
{
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        try
        {
            while(true)
            {
                System.out.println("������");
                Thread.sleep(1); 
            }
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
       /* while(true)
        {
            System.out.println("������");
            if(Thread.interrupted())
                break;
            
        }*/
        System.out.println("�ڿ�����");
        System.out.println("��������");
    }
}