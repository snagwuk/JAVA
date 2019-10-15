package ch08;
class Bike
{
    int wheel;
    Bike(int wheel)
    {
        this.wheel = wheel;
    }
    public String drive()
    {
        // TODO Auto-generated method stub
        return "페달을 밝는다.";
    }
    public String stop()
    {
        // TODO Auto-generated method stub
        return "브레이크를 잡는다";
    }
}

class AutoBike extends Bike
{
    AutoBike(int wheel)
    {
        super(wheel);
    }
    public String drive()
    {
        // TODO Auto-generated method stub
        return "시작버튼을 누른다";
    }
    public String stop()
    {
        // TODO Auto-generated method stub
        return "멈춤 버튼을 누른다";
    }
}
public class BikeEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        AutoBike ab = new AutoBike(2);
        System.out.println(ab.drive());
        System.out.println(ab.wheel + "개의 바퀴가 굴러 갑니다.");
        System.out.println(ab.stop());
        Bike b = new Bike(4);
        System.out.println(b.drive());
        System.out.println(b.wheel + "개의 바퀴가 굴러 갑니다.");
        System.out.println(b.stop());
    }
    
}
