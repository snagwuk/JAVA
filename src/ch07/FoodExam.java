package ch07;
class Food 
{
    int price;
    int point;
    Food(int price)
    {
        this.price = price;
        point = price /10;
    }
}
class Fruit extends Food
{
    int brix;
    Fruit(int price, int brix)
    {
        super(price);
        this.brix = brix;
        // TODO Auto-generated constructor stub
    }
    
}
class Drink extends Food
{
    int ml;
    Drink(int price,  int ml)
    {
        super(price);
        this.ml=  ml;
        // TODO Auto-generated constructor stub
    }
    
}
class Snack extends Food
{
    int gram;
    Snack(int price, int gram)
    {
        super(price);
        this.gram = gram;
        // TODO Auto-generated constructor stub
    }
    
}
class Apple extends Fruit
{

    Apple(int price, int brix)
    {
        super(price, brix);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "사과";
    }
    
}
class Peach extends Fruit
{

    Peach(int price, int brix)
    {
        super(price, brix);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "복숭아";
    }
    
}
class Coke extends Drink
{

    Coke(int price, int ml)
    {
        super(price, ml);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "콜라";
    }
    
}
class Cyder extends Drink
{

    Cyder(int price, int ml)
    {
        super(price, ml);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "사이다";
    }
    
}
class Biscuit extends Snack
{

    Biscuit(int price, int gram)
    {
        super(price, gram);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "비스킷";
    }
    
}
class Cookie extends Snack
{

    Cookie(int price, int gram)
    {
        super(price, gram);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "쿠키";
    }
}

class Buyer2
{
    int money;
    int point;
    public Buyer2()
    {
        money = 10000;
        point =0;
        // TODO Auto-generated constructor stub
    }
    Food[] cart = new Food[10];
    int fruitcnt=0,drinkcnt=0,snackcnt=0,cnt=0;

    
    void buy(Food f)
    {
        if(money < f.price)
        {
            System.out.println("잔액부족");
            return;
        }
        money -= f.price;
        point += f.point;
        System.out.println(f + "구입. " + "가격 : " + f.price);
        
        cart[cnt++] = f;
        
        if(f instanceof Fruit)
            fruitcnt++;
        if(f instanceof Drink)
            drinkcnt++;
        if(f instanceof Snack)
            snackcnt++;

        
        
        
    }
    void summary()
    {
        int sum=0,fsum=0,dsum=0,ssum=0;
       String sumn="",fsumn="",dsumn="",ssumn="";
       
       for(int j = 0 ; j < cnt ; j ++)
       {
           if(cart[j] instanceof Fruit)
           {    
               fsumn += cart[j] +" ";
               fsum += cart[j].price;
               fruitcnt++;
           }
           if(cart[j] instanceof Drink)
           {
               dsumn += cart[j] +" ";
               dsum += cart[j].price;
               drinkcnt++;
           }
           if(cart[j] instanceof Snack)
           {
               ssumn += cart[j] +" ";
               ssum += cart[j].price;
               snackcnt++;
           }
           sum += cart[j].price;
           sumn += cart[j] +" ";
       }
       System.out.println("총 구매건수 : " + cnt + ", 총구매금액 : " +  sum + ", 총구매 물품 : " + sumn);
       System.out.println("과일 구매건수 : " + fruitcnt + ", 구매금액 : " +  fsum + ", 총구매 물품 : " + fsumn);
       System.out.println("음료 구매건수 : " + drinkcnt + ", 구매금액 : " +  dsum + ", 총구매 물품 : " + dsumn);
       System.out.println("과자 구매건수 : " + snackcnt + ", 구매금액 : " +  ssum + ", 총구매 물품 : " + ssumn);
       
       System.out.println("잔액 : " + money + ", 포인트 : " + point);
    }
    
    
    
}
public class FoodExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Buyer2 b = new Buyer2();
        
        b.buy(new Apple(1000, 7));
        b.buy(new Peach(2000, 9));
        b.buy(new Coke(3000, 250));
        b.buy(new Cyder(1200, 250));
        b.buy(new Cookie(1600, 100));
        b.summary();
        
    }
    
}
