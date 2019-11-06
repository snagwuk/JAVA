package ch16;

import java.util.Arrays;
import java.util.List;

public class ReductionExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> stlist = Arrays.asList(new Student("½Å¿ë±Ç",95),new Student("È«±æµ¿",92),new Student("±èÀÚ¹Ù",88));
        int sum1 = stlist.stream().mapToInt(Student :: getScore).sum();
        
        int sum2 = stlist.stream().map(Student :: getScore).reduce((a,b) -> a+b).get();
        
        int sum3 = stlist.stream().map(Student :: getScore).reduce(100, (a,b) -> a+b);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
    
}
