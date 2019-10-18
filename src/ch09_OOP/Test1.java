package ch09_OOP;
class Outer
{
    class Inner
    {
        int iv =100;
    }
}
public class Test1
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println(new Outer().new Inner().iv);
        
        Outer out = new Outer();
        System.out.println(out.new Inner().iv);
        
    }
    
}
