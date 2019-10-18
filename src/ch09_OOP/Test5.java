package ch09_OOP;

class Outer4
{
    int value = 10;
    class Ineer
    {
        int value = 20;
        
        void method1()
        {
            int value  =30 ;
            System.out.println("            Value : " + value);
            System.out.println("       this.Value : " + this.value);
            System.out.println("Outer4.this.Value : " + Outer4.this.value);
        }
    }
}
public class Test5
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Outer4 out4 = new Outer4();
        Outer4.Ineer inner = out4.new Ineer();
        inner.method1();
    }
    
}
