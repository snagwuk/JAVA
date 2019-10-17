package ch09;
class A
{
    A()
    {
        System.out.println("A객체가 생성됨");
    }
    
    public class B
    {
        B()
        {
            System.out.println("B객체가 생성됨");
        }
        int field1;
        void method1()
        {
        }
    }
    
    
    static class C
    {
        C()
        {
            System.out.println("C객체가 생성됨");
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
                System.out.println("D객체가 생성됨");
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
public class ABC
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        A a = new A();
        //인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 =3;
        b.method1();
        //정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();
        //로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();
    }
    
}
