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
        return "���";
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
        return "������";
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
        return "�ݶ�";
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
        return "���̴�";
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
        return "��Ŷ";
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
        return "��Ű";
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
            System.out.println("�ܾ׺���");
            return;
        }
        money -= f.price;
        point += f.point;
        System.out.println(f + "����. " + "���� : " + f.price);
        
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
       System.out.println("�� ���ŰǼ� : " + cnt + ", �ѱ��űݾ� : " +  sum + ", �ѱ��� ��ǰ : " + sumn);
       System.out.println("���� ���ŰǼ� : " + fruitcnt + ", ���űݾ� : " +  fsum + ", �ѱ��� ��ǰ : " + fsumn);
       System.out.println("���� ���ŰǼ� : " + drinkcnt + ", ���űݾ� : " +  dsum + ", �ѱ��� ��ǰ : " + dsumn);
       System.out.println("���� ���ŰǼ� : " + snackcnt + ", ���űݾ� : " +  ssum + ", �ѱ��� ��ǰ : " + ssumn);
       
       System.out.println("�ܾ� : " + money + ", ����Ʈ : " + point);
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
