package ch15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Person> treeSet = new TreeSet<Person>();
        
        treeSet.add(new Person("È«±æµ¿",45));
        treeSet.add(new Person("±èÀÚ¹Ù",25));
        treeSet.add(new Person("¹ÚÁö¿ø",31));
        
        Iterator<Person> it = treeSet.iterator();
        while(it.hasNext())
        {
            Person p = it.next();
            System.out.println(p.name + "-" + p.age);
        }
           
    }
    
}
class Person implements Comparable<Person>
{
    String name;
    int age;
    
    public Person(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o)
    {
        // TODO Auto-generated method stub
        if(age<o.age) return 1;
        else  if(age==o.age) return 0;
        else
        return -1;
    }
    
}

