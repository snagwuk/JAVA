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
        System.out.println("한국 타이어가 굴러갑니다.");
    }
    
}
class KumhoTire implements Tire
{

    @Override
    public void roll()
    {
        // TODO Auto-generated method stub
        System.out.println("금호 타이어가 굴러갑니다.");
    }
    
}
