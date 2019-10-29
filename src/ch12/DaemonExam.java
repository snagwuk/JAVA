package ch12;

public class DaemonExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        AutoSaveThread at = new AutoSaveThread();
        at.setDaemon(true);
        at.start();
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
        System.out.println("메인 스레드 종료");
    }
    
}
class AutoSaveThread extends Thread
{
    void save()
    {
        System.out.println("작업 내용을 저장함.");
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
            break;
        }
           save();
       }
    }
}