package ch06;

public class Calculator
{
    static double pi = 3.14159;
    static int plusS(int x, int y)
    {
        return x +y;
    }
    static int minus(int x, int y)
    {
        return x - y;
    }
    void powerOn()
    {
        System.out.println("������ �մϴ�.");
    }

    int plus(int x, int y)
    {
        return x+y;
    }
    double divide(int x, int y)
    {
        return (double)x / (double)y;
    }

    double avg(int x, int y)
    {
        return plus(x,y) / 2.0;
    }
    void execute()
    {
        System.out.println("������ : " + avg(7,10));
    }

    void powerOff()
    {
        System.out.println("������ ���ϴ�.");
    }
    double areaRectangle(double x)
    {
        return x*x;
    }
    double areaRectangle(double x,double y)
    {
        return x*y;
    }
}
