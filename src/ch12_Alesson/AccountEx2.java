package ch12_Alesson;

public class AccountEx2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
      

        Runnable r = new Person();
        
        Thread r1 = new Thread(r);
        Thread r2 = new Thread(r);
        Thread r3 = new Thread(r);

        r1.start();
        r2.start();
        r3.start();
     
        
    }
    
}
class Person implements Runnable
{
    Acount acc = new Acount();
    
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


