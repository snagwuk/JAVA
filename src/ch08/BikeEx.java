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
        return "����� ��´�.";
    }
    public String stop()
    {
        // TODO Auto-generated method stub
        return "�극��ũ�� ��´�";
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
        return "���۹�ư�� ������";
    }
    public String stop()
    {
        // TODO Auto-generated method stub
        return "���� ��ư�� ������";
    }
}
public class BikeEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        AutoBike ab = new AutoBike(2);
        System.out.println(ab.drive());
        System.out.println(ab.wheel + "���� ������ ���� ���ϴ�.");
        System.out.println(ab.stop());
        Bike b = new Bike(4);
        System.out.println(b.drive());
        System.out.println(b.wheel + "���� ������ ���� ���ϴ�.");
        System.out.println(b.stop());
    }
    
}
