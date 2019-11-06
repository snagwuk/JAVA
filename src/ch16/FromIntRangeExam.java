package ch16;

import java.util.stream.IntStream;

public class FromIntRangeExam
{
    static int sum1;
    static int sum2;
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        IntStream stream1 = IntStream.rangeClosed(1, 10);
        IntStream stream2 = IntStream.range(1,10);
        
        stream1.forEach( a-> sum1+=a);
        stream2.forEach( a-> sum2+=a);
        
        System.out.println(sum1);
        System.out.println(sum2);
    }
    
}

