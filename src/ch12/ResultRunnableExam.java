package ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ResultRunnableExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors
                .newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        
        System.out.println("[작업 처리 요청]");
        class Task implements Runnable
        {
            Result result;
            
            Task(Result result)
            {
                this.result = result;
            }
            
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                int sum = 0 ;
                for(int i = 0 ; i <=10;i++)
                    sum +=i;
                result.addValue(sum);
            }
        }
        Result result = new Result();
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);
        Future<Result> future1 = executorService.submit(task1,result);
        Future<Result> future2 = executorService.submit(task2,result);
        
        try
        {
            result = future1.get();
            result = future2.get();
            System.out.println("처리결과 " + result.accumValue);
            System.out.println("작업 처리 완료");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("실행 예외 발생" + e.getMessage());
        }
        executorService.shutdown();
    }
    
    
    
}
class Result
{
    int accumValue;
    synchronized void addValue(int valus)
    {
        accumValue += valus;
    }
}
