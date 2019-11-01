package ch14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Consumer<String> consumer = t -> System.out.println(t+"8");
        consumer.accept("java");
        BiConsumer<String, String> bixonsumer  = (t,u) -> System.out.println(t+u);
        bixonsumer.accept("java","8");
        DoubleConsumer dc = d -> System.out.println("JAVA " + d);
        dc.accept(8.0);
        ObjIntConsumer<String> obji= (t,i) -> System.out.println(t + i);
        obji.accept("JJACva", 8);
    }
    
}
