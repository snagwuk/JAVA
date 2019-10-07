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
        System.out.println("전원을 켭니다.");
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
        System.out.println("실행결과 : " + avg(7,10));
    }

    void powerOff()
    {
        System.out.println("전원을 끕니다.");
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
