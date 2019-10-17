package ch09;

public class Anonymous
{
    Person field = new Person() 
    {
        void wake()
        {
            System.out.println("6시에 일어납니다.");
            work();
        }
        
        void work()
        {
            System.out.println("출근합니다. Person field - wake() - work() ");
        }
    };
    
    void method1()
    {
        Person localVar = new Person() 
        {
            void walk()
            {
                System.out.println("산책합니다.");
            }
            
            void wake()
            {
                System.out.println("7시에 일어납니다.");
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
        System.out.println("7시에 일어납니다.");
    }
}
