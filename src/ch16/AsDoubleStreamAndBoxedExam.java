package ch16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream
        .asDoubleStream()
        .forEach(d -> System.out.println(d));
        System.out.println();
        
        intStream = Arrays.stream(intArray);
        intStream
        .boxed()
        .forEach(obj -> System.out.println(obj.intValue()));
    }
    
}
