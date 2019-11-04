package ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Function<String, MemberY> function1 =  MemberY :: new ;
        MemberY m = function1.apply("angel");
        BiFunction<String, String, MemberY> func2 = MemberY :: new ;
        MemberY m2 = func2.apply("신천사", "angel");
    }
    
}
class MemberY
{
    String name;
    String id;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public MemberY()
    {
        System.out.println("MemberY() 실행");
    }
    public MemberY( String id)
    {
        System.out.println("MemberY( String id) 실행");
        this.id = id;
    }
    public MemberY(String name, String id)
    {
        System.out.println("MemberY(String name, String id) 실행");
        this.name = name;
        this.id = id;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
}
