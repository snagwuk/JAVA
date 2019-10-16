package ch09;

public class DefalutMethodExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MyClassA mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();
        
        System.out.println("天天天天天天天");

        MyClassB mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
        
        System.out.println("天天天天天天天");
        System.out.println("天天天天天天天");
        
        chileinterface1 c1 = new chileinterface1() 
        {
          
            @Override
            public void method1()
            {
                // TODO Auto-generated method stub
            }
           
            @Override
            public void method3()
            {
                // TODO Auto-generated method stub
            }
        };
        c1.method1();
        c1.method2();
        c1.method3();
        chileinterface2 c2 = new chileinterface2() 
        {
          
            @Override
            public void method1()
            {
                // TODO Auto-generated method stub
            }
           
            @Override
            public void method3()
            {
                // TODO Auto-generated method stub
            }
        };
        c2.method1();
        c2.method2();
        c2.method3();
        chileinterface3 c3 = new chileinterface3() 
        {
          
            @Override
            public void method1()
            {
                // TODO Auto-generated method stub
            }
           
            @Override
            public void method3()
            {
                // TODO Auto-generated method stub
            }

            @Override
            public void method2()
            {
                // TODO Auto-generated method stub
                
            }
        };
        c3.method1();
        c3.method2();
        c3.method3();
    }
    
    
    
}

class MyClassA implements MyInterface
{

    @Override
    public void method1()
    {
        // TODO Auto-generated method stub
        System.out.println("MyClassA - method1");
    }
    
}
class MyClassB implements MyInterface
{

    @Override
    public void method1()
    {
        // TODO Auto-generated method stub
        System.out.println("MyClassB - method1");
    }
    public void method2()
    {
        System.out.println("MyClassB - method2");
    }
    
}

interface MyInterface
{
    public void method1();
    public default void method2()
    {
        System.out.println("MyInterface - method2");
    }
}
