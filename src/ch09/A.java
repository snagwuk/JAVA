package ch09;

public class A
{
    A()
    {
        System.out.println("A按眉啊 积己凳");
    }
    
    public class B
    {
        B()
        {
            System.out.println("B按眉啊 积己凳");
        }
    }
    
    int field1;
    
    void method1()
    {
    }
    
    static class C
    {
        C()
        {
            System.out.println("C按眉啊 积己凳");
        }
        
        int field1;
        
        static int field2;
        
        void method1()
        {
        }
        
        static void method2()
        {
        }
    }
    
    void method()
    {
        class D 
        {
            D()
            {
                System.out.println("D按眉啊 积己凳");
            }
            int field1; 
            void method1()
            {
                
            }
        }
        D d = new D();
        d.field1 = 3;
    }
}
