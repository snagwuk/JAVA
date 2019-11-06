package ch16;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Student> stList = Arrays.asList(new Student("�ſ��",12),new Student("ȫ�浿",20),new Student("���̼�",30));
        double avg = stList.stream().mapToInt(Student :: getScore).average().getAsDouble();
        
        System.out.println(avg);
    }
    
}
