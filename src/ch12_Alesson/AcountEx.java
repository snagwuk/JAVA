package ch12_Alesson;
class Acount
{
    private int balance =1000;
    int getBalance()
    {
        return balance;
        
    }
    synchronized void withraw(int money)
    {
        if(balance >= money)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
            }
            balance -= money;
        }
        
    }
}
public class AcountEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Acount acc= new Acount();

        Thread r1 = new Person2(acc);
        Thread r2 = new Person2(acc);
        
        r1.start();
        r2.start();
        
     
        
    }
    
}
class Person2 extends Thread
{
    Acount acc;
    public Person2( Acount acc)
    {
        this.acc= acc;
        // TODO Auto-generated constructor stub
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(acc.getBalance() > 0 )
        {
            int money = (int)(Math.random()*3+1)*100;
            acc.withraw(money);
            System.out.println("balance = " + acc.getBalance());
        }
    }
    
}
