package ch09;

public class Anonymous
{
    Person field = new Person() 
    {
        void wake()
        {
            System.out.println("6�ÿ� �Ͼ�ϴ�.");
            work();
        }
        
        void work()
        {
            System.out.println("����մϴ�. Person field - wake() - work() ");
        }
    };
    
    void method1()
    {
        Person localVar = new Person() 
        {
            void walk()
            {
                System.out.println("��å�մϴ�.");
            }
            
            void wake()
            {
                System.out.println("7�ÿ� �Ͼ�ϴ�.");
                walk();
            }
        };
        localVar.wake();
    }
    
    void method2(Person p)
    {
        p.wake();
    }
}

class Person
{
    void wake()
    {
        System.out.println("7�ÿ� �Ͼ�ϴ�.");
    }
}
