package ch14;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class StudentZ
{
    private String name;
    private String sex;
    private int  score;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public int getscore()
    {
        return score;
    }
    public void setscore(int score)
    {
        this.score = score;
    }
    public StudentZ(String name, String sex, int score)
    {
        super();
        this.name = name;
        this.sex = sex;
        this.score = score;
    }
    
    
}
public class PredicateExam
{
    private static List<StudentZ> list = Arrays.asList(new StudentZ("홍길동","남자",90),
                                                       new StudentZ("김순희","여자",90),
                                                       new StudentZ("김자바","남자",95),
                                                       new StudentZ("박한나","여자",92));
    
    public static  double avg(Predicate<StudentZ> predicate)
    {
        int count = 0 , sum = 0 ;
        for(StudentZ s : list)
        {
            if(predicate.test(s))
            {
                count++;
                sum += s.getscore();
            }
        }
        return (double) sum /count;
                
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        double maleavg = avg(t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 : "  +  maleavg);
        double femaleavg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 : "  +  femaleavg);
    }
    
}
