package ch08;
class Bike2
{
    int wheel;
    Bike2(int wheel)
    {
        this.wheel = wheel;
    }
    public void drive()
    {
        // TODO Auto-generated method stub
        System.out.println( "페달을 밝는다.");
    }
    public void stop()
    {
        // TODO Auto-generated method stub
        System.out.println( "브레이크를 잡는다");
    }
}

class AutoBike2 extends Bike2
{
    boolean power;
    AutoBike2(int wheel)
    {
        super(wheel);
    }
    void power()
    {
        power = !power;
        if (power)
            System.out.println("전원이 켜졌습니다.");
        else
            System.out.println("전원이 꺼졌습니다.");
    }
    public void drive()
    {
        // TODO Auto-generated method stub
        System.out.println( "시작버튼을 누른다");
    }
    public void stop()
    {
        // TODO Auto-generated method stub
        System.out.println( "멈춤 버튼을 누른다");
    }
}
public class BikeEX2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        AutoBike2 ab = new AutoBike2(2);
        ab.power();
        ab.drive();
        System.out.println(ab.wheel + "개의 바퀴가 굴러 갑니다.");
        ab.stop();
        
        Bike2 b; 
        b = (Bike2) ab;
        //b.power();
        b.drive();      
        System.out.println(b.wheel + "개의 바퀴가 굴러 갑니다.");
        b.stop();
        
        AutoBike2 ab2 = null;
        ab2 = (AutoBike2) b;
        ab2.power();
        ab2.drive();
        System.out.println(ab2.wheel + "개의 바퀴가 굴러 갑니다.");
        ab2.stop();
        


    }
    
}
