package ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("È«±æµ¿",30));
        set.add(new Member("È«±æµ¿",30));
        System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
    }
    
}
class Member
{
    String name;
    int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public Member(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        if( obj instanceof Member)
        {
            Member m = (Member)obj;
            return m.name.equals(name) && (m.age == age);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        // TODO Auto-generated method stub
        return name.hashCode() + age;
    }
}

