package ch09_OOP;
class Student
{
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;
        int getTotal()
        {
            return (kor+eng+math);
        }
        double getAverage()
        {
            return getTotal() / 3.0;
        }
}
public class Exam01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student s = new Student();
        s.name = "ȫ�浿";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        
        System.out.println("�̸� : " + s.name);
        System.out.println("���� : " + s.getTotal());
        System.out.println("��� : " + s.getAverage());
             
        
    }
    
}
