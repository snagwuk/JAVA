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

        myCal.execute();

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

        Calculator myCalcu = new Calculator();
        double result3 = myCalcu.areaRectangle(10);

        Calculator myCalcu2 = new Calculator();
        double result4 = myCalcu2.areaRectangle(10,20);

        System.out.println("���簢������ = " + result3);
        System.out.println("���簢������ = " + result4);


        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

        double result11 = 10 * 10 * Calculator.pi;
        int result12 = Calculator.plusS(10,5);
        int result13 = Calculator.minus(10,5);
        System.out.println("result11 : " + result11);
        System.out.println("result12 : " + result12);
        System.out.println("result13 : " + result13);


    }

}
