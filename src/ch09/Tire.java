package ch09;

public interface Tire
{
    public void roll();
}
class HankookTire implements Tire
{

    @Override
    public void roll()
    {
        // TODO Auto-generated method stub
        System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");
    }
    
}
class KumhoTire implements Tire
{

    @Override
    public void roll()
    {
        // TODO Auto-generated method stub
        System.out.println("��ȣ Ÿ�̾ �������ϴ�.");
    }
    
}
