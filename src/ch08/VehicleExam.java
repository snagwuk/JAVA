package ch08;
class Vehicle
{
    void run()
    {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle
{
    @Override
    void run()
    {
        // TODO Auto-generated method stub
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle
{
    @Override
    void run()
    {
        // TODO Auto-generated method stub
        System.out.println("택시가 달립니다.");
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
