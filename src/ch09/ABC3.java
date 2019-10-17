package ch09;

public class ABC3
{
    int field1;
    void method1()
    {
    }
    
    static int field2;
    static void method2() {}
    
    class B
    {
        void method()
        {
            field1 = 10;
            field2 = 20;
            method1();
            method2();
        }
    }
    
    static class C 
    {
        void method()
        {
            field2 = 10;
            method2();
        }
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
