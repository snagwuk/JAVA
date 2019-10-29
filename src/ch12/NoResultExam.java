package ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExam
{
    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ExecutorService executorservice = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[�۾� ó�� ���]");
        Runnable runnable = new Runnable() {
            
            @Override
            public void run()
            {
                int sum = 0 ;
                for(int i = 0; i<=10;i++)
                {
                    sum +=i;
                    
                }
                System.out.println("ó����� : " + sum);
                
            }
        };
        
        Future future = executorservice.submit(runnable);
        System.out.println("===========");
        try
        {
            future.get();
            System.out.println("�۾�ó���Ϸ�");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println("���� ���� �߻�" + e.getMessage());
        }
        executorservice.shutdown();
    }
    
}
