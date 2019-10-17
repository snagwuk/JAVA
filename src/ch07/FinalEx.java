package ch07;
class Parent
{
    void method()
    {
        System.out.println("Parent¿« method");
    }
}
class Child3 extends Parent
{
    final int val = 100;
    final void method()
    {
        System.out.println("Child  ¿« method");
        //System.out.println(val+=10);
    }
}
public class FinalEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
