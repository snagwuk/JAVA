package ch12;

public class ThreadNameExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Thread mainThtead = Thread.currentThread();
        System.out.println("���α׷� ���� ������ �̸� : " + mainThtead.getName());
        ThreadA threadA = new ThreadA();
        System.out.println("�۾� ������ �̸� : " + threadA.getName());
        threadA.start();
        ThreadB threadB = new ThreadB();
        System.out.println("�۾� ������ �̸� : " + threadB.getName());
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
            System.out.println(getName() + "�� ����� ����");
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
            System.out.println(getName() + "�� ����� ����");
        }
    }
}
