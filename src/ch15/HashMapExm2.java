package ch15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExm2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        map.put(new Student(1, "È«±æµ¿"), 95);
        map.put(new Student(1, "È«±æµ¿"), 95);
        System.out.println("ÃÑ ¿£Æ®¸® ¼ö : " +  map.size());
    }
    
}
class Student
{
    int sno;
    String name;
    public Student(int sno, String name)
    {

        this.sno = sno;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj)
    { if( obj instanceof Student)
    {
        Student m = (Student)obj;
        return m.name.equals(name);
    }
    return false;
    }
    @Override
    public int hashCode()
    {
        // TODO Auto-generated method stub
        return sno+name.hashCode();
    }
    
}
