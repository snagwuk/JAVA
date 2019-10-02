package ch06;

public class Calculator
{
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
}
