package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        PersonZ m1 = new PersonZ("aaa",30);
        PersonZ m2 = new PersonZ("bbb",20);
        PersonZ m3 = new PersonZ("ddd",10);
        PersonZ m4 = new PersonZ("baa",40);
        PersonZ[] ms = {m1,m2,m3,m4};
        Arrays.sort(ms, new ComparatorMs());
        System.out.println(Arrays.toString(ms));
        
        Arrays.sort(ms, new ComparatorMsAGE());
        System.out.println(Arrays.toString(ms));
    }
    
}
class PersonZ
{
    String name;
    int age;
public PersonZ(String name, int age)
{
    // TODO Auto-generated constructor stub
    this.name = name;
    this.age = age;
}
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Member [name=" + name + ", age="+age+"] ";
    }
}
class ComparatorMs implements Comparator<PersonZ>
{

    @Override
    public int compare(PersonZ o1, PersonZ o2)
    {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }
    
}
class ComparatorMsAGE implements Comparator<PersonZ>
{

    @Override
    public int compare(PersonZ o1, PersonZ o2)
    {
        // TODO Auto-generated method stub
        return o2.age-o1.age;
    }
    
}
