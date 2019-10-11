package ch07;

class Calculator
{
    double areaCircle(double r)
    {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159*r*r;
    }
}
class Computer extends Calculator
{
    @Override
    double areaCircle(double r)
    {
        System.out.println("Conputer 객체의 areaCircle() 실행");
        return Math.PI*r*r;
    }
}
public class ComputerEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Calculator cl = new Calculator();
        System.out.println(cl.areaCircle(10));

        Computer cm = new Computer();
        System.out.println(cm.areaCircle(10));



        Calculator cl2 = new Computer();
        System.out.println(cl2.areaCircle(10));

        //Computer cm2 = new Calculator();
        //System.out.println(cm2.areaCircle(10));





    }

}
class Airplane
{
    void land()
    {
        System.out.println("착륙합니다.");
    }
    public void fly()
    {
        System.out.println("일반비행입니다.");
    }
    void takeOff()
    {
        System.out.println("이륙합니다.");
    }
}
class SupersonicAirplane  extends Airplane
{
    static final int NORMAL =1;
    static final int SUPERSONIC = 2;
    int flyMode = NORMAL;

    @Override
    public void fly()
    {
        if(flyMode == SUPERSONIC)
            System.out.println("초음속비행합니다.");
        else
            super.fly();
    }
}
