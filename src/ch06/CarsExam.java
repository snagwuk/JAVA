package ch06;

public class CarsExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Cars myCars = new Cars();
        myCars.setGas(5);

        boolean gasState = myCars.isLeftGas();
        if(gasState)
        {
            System.out.println("����մϴ�.");
            myCars.run();
        }

        if(myCars.isLeftGas())
        {
            System.out.println("Gas�� ������ �ʿ䰡 �����ϴ�.");
        }
        else
            System.out.println("Gas�� �����ϼ���");
    }

}
