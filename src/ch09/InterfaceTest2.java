package ch09;

public class InterfaceTest2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        A2 a = new A2();
        a.methodA();
    }
    
}

class A2
{
    void methodA()
    {
        I2 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
interface I2 
{
    void methodB();
}
class InstanceManager
{
    public static I2 getInstance()
    {
        return new B2();
    }
}
class B2 implements I2
{

    @Override
    public void methodB()
    {
        // TODO Auto-generated method stub
     System.out.println("methodB - B2");   
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "class B2 ____";
    }
    
}

