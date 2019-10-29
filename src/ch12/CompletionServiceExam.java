package ch12;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionServiceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
        System.out.println("작업처리 요청");
        for(int i = 0 ; i<3;i++)
        {
            completionService.submit(new Callable<Integer>() {
                
                @Override
                public Integer call() throws Exception
                {
                    int sum = 0;
                    for(int i = 0 ; i <=10 ; i ++)
                        sum +=i;
                    
                    return sum;
                }
            });
            System.out.println("처리 완료된 작업확인");
            executorService.submit(new Runnable() {
                
                @Override
                public void run()
                {
                    while(true)
                    {
                        try
                        {
                            
                        }
                        catch (Exception e)
                        {
                            // TODO: handle exception
                        }
                    }
                    
                }
            })
        }
    }
    
}
