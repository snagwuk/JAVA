package ch12;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        AutoSaveThread ast = new AutoSaveThread();
        ast.setName("AutoSaveThread");
        ast.setDaemon(true);
        ast.start();
        
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for(Thread thread : threads)
        {
            System.out.println("Nams : " + thread.getName() + ((thread.isDaemon()) ? "데몬":"(주)"));
            System.out.println("\t 소속그룹 : " +  thread.getThreadGroup().getName() + "\n");
        }
    }
    
}

