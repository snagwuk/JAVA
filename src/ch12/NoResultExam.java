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

        System.out.println("[작업 처리 요망]");
        Runnable runnable = new Runnable() {
            
            @Override
            public void run()
            {
                int sum = 0 ;
                for(int i = 0; i<=10;i++)
                {
                    sum +=i;
                    
                }
                System.out.println("처리결과 : " + sum);
                
            }
        };
        
        Future future = executorservice.submit(runnable);
        System.out.println("===========");
        try
        {
            future.get();
            System.out.println("작업처리완료");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println("실행 예외 발생" + e.getMessage());
        }
        executorservice.shutdown();
    }
    
}
