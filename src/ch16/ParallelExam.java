package ch16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�","�Դٽ�","�麴��");
        
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
