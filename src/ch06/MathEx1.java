package ch06;
class Math1
{
    char add1(int a, int b)
    {
        return (char)(a+b);
    }

    long add2(int a, int b)
    {
        return a+b;
    }
    double add3(int a, int b)
    {
        return a+b;
    }
}
public class MathEx1
{
    public static void main(String[] args)
    {

        Math1 m = new Math1();
        System.out.println(m.add1(45,20));
        System.out.println(m.add2(10,20));
        System.out.println(m.add3(10,20));

    }
}
