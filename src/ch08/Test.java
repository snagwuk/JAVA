package ch08;

class ABC
{
    String name;
    ABC(String name)
    {
        this.name = name;
    }
    
}
class CDE extends ABC
{
    int a;
    CDE(String name, int a)
    {
        super(name);
        this.a = a;
    }
}
public class Test
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
