package ch11;

import java.util.Objects;

public class HashCodeExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student s1 = new Student(1,"ȫ�浿");
        Student s2 = new Student(1,"ȫ�浿");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(Objects.hashCode(s2));
    }
    
}
class Student
{
    int sno;
    String name;
    Student(int sno,    String name)
    {
        this.sno = sno;
        this.name = name;
    }
}
