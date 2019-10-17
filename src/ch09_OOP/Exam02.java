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
        return "이름 : " + name+" / 반 : " + ban+" / 번호 : " + no+"\n점수 : 국어:"+kor+"점 / 영어:"+eng+"점 / 수학:"+math+"점";
    }
 
}
public class Exam02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student2 s = new Student2("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
    
}
