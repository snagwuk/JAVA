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
        System.out.println("Bus 달립니다.");
    }

    public void checkFare()
    {
        // TODO Auto-generated method stub
        System.out.println("승차확인");
    }
    
}
 class Taxi implements  Vehicle
{

    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Taxi 달립니다.");
    }
    
}
