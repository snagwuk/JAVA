package ch12_Alesson;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExam
{
    private ExecutorService executorService;
    
    CallbackExam()
    {
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        
    }
    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

        @Override
        public void completed(Integer result, Void attachment)
        {
            // TODO Auto-generated method stub
            
            System.out.println("completed() ½ÇÇà : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment)
        {
            // TODO Auto-generated method stub
            System.out.println("failed() ½ÇÇà : " + exc.toString());
            
        }};
        public void doWork(final String x , final String y)
        {
            Runnable task = new Runnable() {
                
                @Override
                public void run()
                {
                    // TODO Auto-generated method stub
                    try
                    {
                        int intX = Integer.parseInt(x);
                        int intY = Integer.parseInt(y);
                        int result= intX+intY;
                        callback.completed(result, null);
                    }
                    catch (NumberFormatException e)
                    {
                        // TODO: handle exception
                        callback.failed(e, null);
                    }
                }
            };
            executorService.submit(task);
            
        }
        void finish()
        {
            executorService.shutdown();
        }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        CallbackExam example = new CallbackExam();
        example.doWork("3", "4");
        example.doWork("3", "»ï");
        example.finish();
        
    }
    
}
