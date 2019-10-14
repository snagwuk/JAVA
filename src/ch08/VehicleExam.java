package ch08;
class Vehicle
{
    void run()
    {
        System.out.println("������ �޸��ϴ�.");
    }
}

class Bus extends Vehicle
{
    @Override
    void run()
    {
        // TODO Auto-generated method stub
        System.out.println("������ �޸��ϴ�.");
    }
}

class Taxi extends Vehicle
{
    @Override
    void run()
    {
        // TODO Auto-generated method stub
        System.out.println("�ýð� �޸��ϴ�.");
    }
}

class Driver
{
    void drive(Vehicle vehicle)
    {
        vehicle.run();
    }
}



public class VehicleExam
{
    public static void main(String[] args)
    {
        Driver d = new Driver();
        
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        
        d.drive(bus);
        d.drive(taxi);
                
        
    }
}
