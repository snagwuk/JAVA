package ch07;

class Parentzz
{

    public String filed1;
    String name;

    public void method1()
    {
        // TODO Auto-generated method stub
        
    }

    public void method2()
    {
        // TODO Auto-generated method stub
        
    }
    
}

class Child extends Parentzz
{

    public String field2;
    int studentNo;

    public void method2()
    {
        // TODO Auto-generated method stub
        
    }
    

}

public class ChildExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Parentzz parent = new Parentzz();
        parent.filed1 ="data1";
        parent.method1();
        parent.method2();
        
        Child child = new Child();
        child.field2 = "YYY";
        child.method2();
        
        
        
    }
    
}
