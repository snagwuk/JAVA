package ch16;

import java.util.Arrays;
import java.util.List;

public class MapExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> studentList = Arrays.asList(
                new Student("홍길동",10), new Student("신용권",20),new Student("유미선",30)                                  
                );
        studentList.stream()
        .mapToInt(Student :: getScore)
        .forEach(sc -> System.out.println(sc));
                
    }
    
}

