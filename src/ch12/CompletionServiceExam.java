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
        System.out.println("�۾�ó�� ��û");
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
            System.out.println("ó�� �Ϸ�� �۾�Ȯ��");
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
