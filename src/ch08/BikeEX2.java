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
        System.out.println( "����� ��´�.");
    }
    public void stop()
    {
        // TODO Auto-generated method stub
        System.out.println( "�극��ũ�� ��´�");
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
            System.out.println("������ �������ϴ�.");
        else
            System.out.println("������ �������ϴ�.");
    }
    public void drive()
    {
        // TODO Auto-generated method stub
        System.out.println( "���۹�ư�� ������");
    }
    public void stop()
    {
        // TODO Auto-generated method stub
        System.out.println( "���� ��ư�� ������");
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
        System.out.println(ab.wheel + "���� ������ ���� ���ϴ�.");
        ab.stop();
        
        Bike2 b; 
        b = (Bike2) ab;
        //b.power();
        b.drive();      
        System.out.println(b.wheel + "���� ������ ���� ���ϴ�.");
        b.stop();
        
        AutoBike2 ab2 = null;
        ab2 = (AutoBike2) b;
        ab2.power();
        ab2.drive();
        System.out.println(ab2.wheel + "���� ������ ���� ���ϴ�.");
        ab2.stop();
        


    }
    
}
