package ch07;
class Tire
{
    int maxRotation;
    int accmulateRotation;
    String location;

    Tire(String location, int maxRotation)
    {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    boolean roll()
    {
        ++accmulateRotation;
        if(accmulateRotation < maxRotation)
        {
            System.out.println(location + " Tire 수명 :" + (maxRotation-accmulateRotation) + "회");
            return true;
        }
        else
        {
            System.out.println("***" + location + " Tire 펑크" );
            return false;
        }
    }

}
class HankookTire extends Tire
{

    HankookTire(String location, int maxRotation)
    {
        super(location, maxRotation);
        // TODO Auto-generated constructor stub
    }
    @Override
    boolean roll()
    {
        ++accmulateRotation;
        if(accmulateRotation < maxRotation)
        {
            System.out.println(location + " HankookTire 수명 :" + (maxRotation-accmulateRotation) + "회");
            return true;
        }
        else
        {
            System.out.println("***" + location + " HankookTire 펑크" );
            return false;
        }

        // TODO Auto-generated method stub
    }

}
class kumhoTire extends Tire
{

    kumhoTire(String location, int maxRotation)
    {
        super(location, maxRotation);
        // TODO Auto-generated constructor stub
    }
    @Override
    boolean roll()
    {
        ++accmulateRotation;
        if(accmulateRotation < maxRotation)
        {
            System.out.println(location + " kumhoTire 수명 :" + (maxRotation-accmulateRotation) + "회");
            return true;
        }
        else
        {
            System.out.println("***" + location + " kumhoTire 펑크" );
            return false;
        }

        // TODO Auto-generated method stub
    }

}
class Car
{
    Tire frontLeftTire = new Tire("앞왼쪽",6);
    Tire frontRightTire = new Tire("앞오른쪽",2);
    Tire backLeftTire = new Tire("뒤왼쪽",3);
    Tire backRightTire = new Tire("뒤오른쪽",4);
    int reun()
    {
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll() == false)
        {
            stop(); return 1;
        }
        if(frontRightTire.roll() == false)
        {
            stop(); return 2;
        }
        if(backLeftTire.roll() == false)
        {
            stop(); return 3;
        }
        if(backRightTire.roll() == false)
        {
            stop(); return 4;
        }
        return 0;
    }
    void stop()
    {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
public class TireExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car car = new Car();
        for(int i = 0 ;i <=5;i++)
        {
            int problemLocation = car.reun();
            switch(problemLocation)
            {
                case 1:
                    System.out.println("앞왼쪽  hankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽  kumhoTire로 교체");
                    car.frontRightTire = new HankookTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("앞왼쪽  hankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("앞왼쪽  kumhoTire로 교체");
                    car.backRightTire = new HankookTire("뒤오른쪽", 17);
                    break;

            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        }

    }

}
