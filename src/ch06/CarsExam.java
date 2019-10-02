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
            System.out.println("출발합니다.");
            myCars.run();
        }

        if(myCars.isLeftGas())
        {
            System.out.println("Gas를 주입할 필요가 없습니다.");
        }
        else
            System.out.println("Gas를 주입하세요");
    }

}
