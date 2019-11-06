package ch16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> list = Arrays.asList("홍길동","신용권","김자바","함다식","백병령");
        
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExam :: print);
        System.out.println();
        
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExam :: print);
    }
    
    static void print(String str)
    {
        System.out.println(str + ":" + Thread.currentThread().getName());
    }
    
}
