package ch06;

public class CalculatorExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int result = myCal.plus(5, 6);
        System.out.println("result1 : " + result);

        byte x= 10, y=4;
        double result2 = myCal.divide(x, y);
        System.out.println("result2 : " + result2);

        myCal.powerOff();

    }

}
