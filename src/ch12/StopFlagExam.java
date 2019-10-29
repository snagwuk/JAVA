package ch12;

public class StopFlagExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        PrintThread1 pt = new PrintThread1();
        pt.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
        pt.setStop(true);
    }
    
}
class PrintThread1 extends Thread
{
    private boolean stop;
    void setStop(boolean stop)
    {
        this.stop = stop;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(!stop)
        {
            System.out.println("실행중");
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}