package ch09;
interface Vehicle
{
    public void run();
}
public class Bus implements  Vehicle
{

    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Bus �޸��ϴ�.");
    }

    public void checkFare()
    {
        // TODO Auto-generated method stub
        System.out.println("����Ȯ��");
    }
    
}
 class Taxi implements  Vehicle
{

    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Taxi �޸��ϴ�.");
    }
    
}
