package ch09_OOP;
class Student2
{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    public Student2(String name,    int ban,    int no,    int kor,    int eng,    int math)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    String info()
    {
        return "�̸� : " + name+" / �� : " + ban+" / ��ȣ : " + no+"\n���� : ����:"+kor+"�� / ����:"+eng+"�� / ����:"+math+"��";
    }
 
}
public class Exam02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student2 s = new Student2("ȫ�浿",1,1,100,60,76);
        System.out.println(s.info());
    }
    
}
