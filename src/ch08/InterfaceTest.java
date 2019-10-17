package ch08;

class A
{
    void autoPlay(I i)
    {
        i.play();
    }
}
interface I 
{
    void play();
}
class B implements I
{

    @Override
    public void play()
    {
        // TODO Auto-generated method stub
        System.out.println("play in B class");
    }
    
}
class C implements I
{

    @Override
    public void play()
    {
        // TODO Auto-generated method stub
        System.out.println("play in C class");
    }
    
}
public class InterfaceTest
{
    public static void main(String[] args)
    {
        A a= new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
        
    }
}
