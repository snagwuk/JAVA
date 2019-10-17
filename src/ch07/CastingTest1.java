package ch07;

class Car
{
    String color;
    int door;
    void drive()
    {
        System.out.println("drive, brrr~");
    }
    void stop()
    {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car
{

    public void water()
    {
        // TODO Auto-generated method stub
        System.out.println("WATER!");
    }
    
}
public class CastingTest1
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        
        fe.water();
        //fe2.water();
        
        car = fe;
        
        
        
        fe2 = (FireEngine)car;
        fe2.water();
        
    }
    
}
