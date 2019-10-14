package ch08;

class Parent
{

    public String filed1;

    public void method1()
    {
        // TODO Auto-generated method stub
        
    }

    public void method2()
    {
        // TODO Auto-generated method stub
        
    }
    
}

class Child extends Vehicle
{

    public String field2;

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
        Parent parent = new Parent();
        parent.filed1 ="data1";
        parent.method1();
        parent.method2();
        
        Child child = new Child();
        child.field2 = "YYY";
        child.method2();
        
        
        
    }
    
}
