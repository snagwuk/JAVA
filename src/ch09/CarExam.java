package ch09;
class Car
{
    Tire flTire = new HankookTire();
    Tire frTire = new HankookTire();
    Tire blTire = new HankookTire();
    Tire brTire = new HankookTire();
    void run()
    {
        flTire.roll();
        frTire.roll();
        blTire.roll();
        brTire.roll();
    }
    
}
public class CarExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car myCar = new Car();
        myCar.flTire = new KumhoTire();
        myCar.frTire = new KumhoTire();
        myCar.run();
        
    }
    
}
