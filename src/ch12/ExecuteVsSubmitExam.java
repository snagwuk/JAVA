package ch12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ExecutorService executorService =    Executors.newFixedThreadPool(2);
        for(int i = 0 ; i<10; i ++)
        {
        Runnable runnable =  new Runnable() {
            public void run()
            {
                ThreadPoolExecutor threadPoolExcutor = (ThreadPoolExecutor) executorService;
                int poolSize = threadPoolExcutor.getPoolSize();
                String threadname = Thread.currentThread().getName();
                System.out.println("[총 스레드 개수 : " +  poolSize + "] 작업 스레드 이름 : " +  threadname);
                int value = Integer.parseInt("a");
            }
        };
        executorService.execute(runnable);
        executorService.submit(runnable);
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
        executorService.shutdown();
    }
    
}
