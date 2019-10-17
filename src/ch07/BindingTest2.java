package ch07;

public class BindingTest2
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        parents2 p = new childs2();
        childs2 c = new childs2();
        
        System.out.println("p.x = " + p.x);
        p.method();
        
        System.out.println("天天天天天天天天天天");
        
        System.out.println("c.x = " + c.x);
        c.method();
        
        
    }
    
}
class parents2
{
    int x = 100;        
    void method()
    {
        System.out.println("parents 詭模萄");
    }
}
class childs2 extends parents2
{
    int x = 200;
    void method()
    {
        System.out.println("x =" + x);
        System.out.println("super.x =  " + super.x);
        System.out.println("this.x =  " + this.x);
        super.method();
    }
}

