package ch16;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Member> list = Arrays.asList(new Member("ȫ�浿",Member.MALE,30),
                                          new Member("�質��",Member.FEMALE,20),
                                          new Member("�ſ��",Member.MALE,45),
                                          new Member("�ڼ���",Member.FEMALE,27));
        
        double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member :: getAge)
                .average()
                .getAsDouble();
                
                System.out.println(ageAvg);
    }
    
}
class Member
{
    static int MALE = 0;
    static int FEMALE = 0;
    
    private String name;
    private int sex;
    private int age;
    public Member(String name, int sex, int age)
    {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public int getSex()
    {
        return sex;
    }
    public void setSex(int sex)
    {
        this.sex = sex;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    
}