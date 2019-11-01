package ch14;

public class RunnableExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Runnable runnable = () -> {
            for(int i = 0; i < 10 ; i++)
                System.out.println(i);
        };
        
        Thread thread1 = new Thread(runnable);
        thread1.start();
        
        Thread thread2 = new Thread(() ->
        {
            for (int i = 0 ; i < 10; i ++)
                System.out.println(i);
        });
        thread2.start();
        
    }
    
}
