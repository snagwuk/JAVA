package ch16;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> stList = Arrays.asList(new Student("신용권",12),new Student("홍길동",20),new Student("유미선",30));
        double avg = stList.stream().mapToInt(Student :: getScore).average().getAsDouble();
        
        System.out.println(avg);
    }
    
}
