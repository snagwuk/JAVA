package ch07;

import java.util.Vector;

class Buyer
{
    public int money = 1000;
    
    public int bonusPoint = 0;
    
    @SuppressWarnings("rawtypes")
    //Product[] item = new Product[10];
    //int i = 0 ;
    Vector vec = new Vector();
    
    
    
    @SuppressWarnings("unchecked")
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
        //item[i++] = p;
        vec.add(p);
    }

    public void summary()
    {
        int sum =0;
        /*for(int j = 0; j < i; j++)
        {   
            if(item[j].price != 0)
                System.out.println(item[j] + " / " + item[j].price + " / " +  item[j].bonusPoint);
            sum +=item[j].price;
        }*/
        for(int i = 0; i < vec.size(); i++)
        {
            Product pp = (Product) vec.get(i);
            System.out.println(pp + " / " + pp.price + " / " +  pp.bonusPoint);
           sum+=pp.price;
        }

        System.out.println("총구매금액 : " + sum);
        
        
    }
    
    void refund(Product p)
    {

            if(vec.remove(p))
            {
                money += p.price;
                bonusPoint -= p.bonusPoint;
/*                x.price = 0;
                x.bonusPoint = 0;*/
                System.out.println(p + "를 반품하였습니다.");
            }
        
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
        Tv tv = new Tv();
        Computer com = new Computer();
        
        b.buy(tv);
        b.buy(com);
        
        b.summary();
        b.refund(com);
        b.summary();
        System.out.println("현재남은돈은 : " + b.money + "만원입니다.");
        System.out.println("현재보너스점수는 : " + b.bonusPoint + "점입니다.");
    }
    
}
