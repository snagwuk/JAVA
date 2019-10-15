package ch08;
abstract class Abs1 
{
    int a = 10;
    abstract int getA();
}
abstract class Abs2 extends Abs1 
{
    int b =20;
    int getA()
    {
        return a;
    }
    abstract int getB();
}
class Normal extends Abs2
{
    int c =30;
    int getA()
    {
        return a;
    }
    int getB()
    { 
        return b;
    }
    int getC()
    { 
        return c;
    }
}
public class AbstractEx1
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Normal n = new Normal();
        System.out.println(n.a + "=>" + n.getA());
        System.out.println(n.b + "=>" + n.getB());
        System.out.println(n.c + "=>" + n.getC());
        Abs2 a2 = n;
        System.out.println(a2.a + "=>" + a2.getA());
        System.out.println(a2.b + "=>" + a2.getB());
        Abs1 a1 = a2;
        System.out.println(a1.a + "=>" + n.getA());
        
        Object o = a1;
       // System.out.println(o.a + "=>" + o.getA());
        
    }
    
}
