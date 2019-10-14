package ch08;

class Buyer
{
    public int money = 1000;
    
    public int bonusPoint = 0;
    
    void buy(Product p)
    {
        if (money < p.price)
        {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        
        System.out.println(p + "를 구매하였습니다.");
        money -= p.price;
        bonusPoint += p.bonusPoint;
        
    }
}

class Product
{
    int price;
    
    int bonusPoint;
    
    public Product(int price)
    {
        // TODO Auto-generated constructor stub
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product
{
    Tv()
    {
        super(100);
    }
    
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Tv";
    }
}

class Computer extends Product
{
    Computer()
    {
        super(200);
    }
    
    public String toString()
    {
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName();
    }
}

public class BuyerEx01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        
        System.out.println("현재남은돈은 : " + b.money + "만원입니다.");
        System.out.println("현재보너스점수는 : " + b.bonusPoint + "점입니다.");
    }
    
}
