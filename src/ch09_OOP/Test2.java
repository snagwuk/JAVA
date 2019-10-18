package ch09_OOP;

class Outer2
{
    static class Inner
    {
        int iv = 200;
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        Outer2.Inner out2Inner = new Outer2.Inner();
        System.out.println(out2Inner.iv);
    }
}
