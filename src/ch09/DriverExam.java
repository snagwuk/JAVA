package ch09;
class Driver
{
    public void drive(Vehicle vehicle)
    {
        if(vehicle instanceof Bus)
        {
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
public class DriverExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Driver d = new Driver();
        d.drive(new Bus());
        d.drive(new Taxi());
        
    }
    
}
