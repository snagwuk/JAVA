package ch11;

public class Member implements Comparable
{
    String name;
    int age;
    Member(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    
   /* @Override
    public int compareTo(Object o)
    {
        // TODO Auto-generated method stub
        Member m = (Member) o;
        return name.compareTo(m.name);
    }*/
    
    @Override
    public int compareTo(Object o)
    {
        // TODO Auto-generated method stub
        Member m = (Member) o;
        return age-(m.age);
    }
    
    
}
