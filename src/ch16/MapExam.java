package ch16;

import java.util.Arrays;
import java.util.List;

public class MapExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> studentList = Arrays.asList(
                new Student("ȫ�浿",10), new Student("�ſ��",20),new Student("���̼�",30)                                  
                );
        studentList.stream()
        .mapToInt(Student :: getScore)
        .forEach(sc -> System.out.println(sc));
                
    }
    
}

