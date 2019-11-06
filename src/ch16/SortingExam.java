package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        IntStream intstream = Arrays.stream(new int[] {5,3,2,1,4});
        intstream.sorted().forEach(n ->  System.out.print(n + " "));
        System.out.println();
        List <Student> stlist = Arrays.asList(new Student("홍길동",30),new Student("신용권",10),new Student("유미선",20));
        stlist.stream()
        .sorted().forEach(n ->  System.out.print(n.getScore() + ","));
        System.out.println();
        

   }
    
}
