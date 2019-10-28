package ch12;

public class ThreadNameExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Thread mainThtead = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : " + mainThtead.getName());
        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();
        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
        
    }
    
}
class ThreadA extends Thread
{
    public ThreadA()
    {
        // TODO Auto-generated constructor stub
        setName("ThreadA");
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
class ThreadB extends Thread
{
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        try
        {
            Thread.sleep(3);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i = 0; i < 20; i++)
        {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
