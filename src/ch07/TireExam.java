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
            System.out.println(location + " Tire ���� :" + (maxRotation-accmulateRotation) + "ȸ");
            return true;
        }
        else
        {
            System.out.println("***" + location + " Tire ��ũ" );
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
            System.out.println(location + " HankookTire ���� :" + (maxRotation-accmulateRotation) + "ȸ");
            return true;
        }
        else
        {
            System.out.println("***" + location + " HankookTire ��ũ" );
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
            System.out.println(location + " kumhoTire ���� :" + (maxRotation-accmulateRotation) + "ȸ");
            return true;
        }
        else
        {
            System.out.println("***" + location + " kumhoTire ��ũ" );
            return false;
        }

        // TODO Auto-generated method stub
    }

}
class Car
{
    Tire frontLeftTire = new Tire("�տ���",6);
    Tire frontRightTire = new Tire("�տ�����",2);
    Tire backLeftTire = new Tire("�ڿ���",3);
    Tire backRightTire = new Tire("�ڿ�����",4);
    int reun()
    {
        System.out.println("[�ڵ����� �޸��ϴ�.]");
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
        System.out.println("[�ڵ����� ����ϴ�.]");
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
                    System.out.println("�տ���  hankookTire�� ��ü");
                    car.frontLeftTire = new HankookTire("�տ���", 15);
                    break;
                case 2:
                    System.out.println("�տ�����  kumhoTire�� ��ü");
                    car.frontRightTire = new HankookTire("�տ�����", 13);
                    break;
                case 3:
                    System.out.println("�տ���  hankookTire�� ��ü");
                    car.backLeftTire = new HankookTire("�ڿ���", 14);
                    break;
                case 4:
                    System.out.println("�տ���  kumhoTire�� ��ü");
                    car.backRightTire = new HankookTire("�ڿ�����", 17);
                    break;

            }
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        }

    }

}
