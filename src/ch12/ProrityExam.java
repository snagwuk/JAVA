package ch12;

public class ProrityExam
{
    
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for(int i = 1 ; i <=10; i++)
        {
            Thread thread = new CalcThread("thread" + i);
            if(i != 10)
                thread.setPriority(thread.MIN_PRIORITY);
            else
                thread.setPriority(thread.MAX_PRIORITY);
            thread.start();
           
        }
       
    }
    
}
class CalcThread extends Thread
{
    public CalcThread(String name)
    {
        // TODO Auto-generated constructor stub
        setName(name);
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 0; i < 2000000; i++)
        {
            
        }
        System.out.println(getName() + "->" + getPriority());
    }
}