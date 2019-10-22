package ch11;
class Member2 implements Cloneable
{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;
    
    public Member2(String id, String name, String password, int age,
            boolean adult)
    {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.name=name;
        this.password=password;
        this.age=age;
        this.adult = adult;
    }

    public Member2 getMember() 
    {
        // TODO Auto-generated method stub
        Member2 cloned = null;
        try
        {
            cloned = (Member2)clone();
        }
        catch (CloneNotSupportedException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        return cloned;
    }
    
}
public class MemberExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Member2 original = new Member2("blue","홍길동","12345",25,true);
        Member2 cloned = original.getMember();
        //cloned.password = "6789";
        System.out.println("복제 객체의 필드값");
        System.out.println("id=" + cloned.id);
        System.out.println("name="+cloned.name);
        System.out.println("password="+cloned.password);
        System.out.println("age="+cloned.age);
        System.out.println("adult="+cloned.adult);
        
        System.out.println("원본 객체의 필드값");
        System.out.println("id="+original.id);
        System.out.println("name="+original.name);
        System.out.println("password="+original.password);
        System.out.println("age="+original.age);
        System.out.println("adult="+original.adult);
        
    }
    
}
