package ch06;
class Math2
{

    public static int add2(int i, int j)
    {
        // TODO Auto-generated method stub
        return i+j;
    }

    public int a;
    public int b;
    public int add1()
    {
        // TODO Auto-generated method stub
        return a+b;
    }

}
public class MathEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Math2 m = new Math2();
        m.a = 20;
        m.b = 20;
        System.out.println(m.add1());
        System.out.println(Math2.add2(10,20));
    }

}
