package ch09;
class A
{
    A()
    {
        System.out.println("A��ü�� ������");
    }
    
    public class B
    {
        B()
        {
            System.out.println("B��ü�� ������");
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
            System.out.println("C��ü�� ������");
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
                System.out.println("D��ü�� ������");
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
        //�ν��Ͻ� ��� Ŭ���� ��ü ����
        A.B b = a.new B();
        b.field1 =3;
        b.method1();
        //���� ��� Ŭ���� ��ü ����
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();
        //���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
        a.method();
    }
    
}
