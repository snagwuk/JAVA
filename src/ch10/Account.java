package ch10;

public class Account
{
    private long balance;
    
    public Account()
    {
    }
    
    public long getBalance()
    {
        return balance;
    }
    
    public void deposit(int money)
    {
        balance += money;
    }
    
    public void withdraw(int money) throws BalanceInsufficientException
        {
            if(balance  < money)
            {
                throw new BalanceInsufficientException("잔고부족"+(money-balance)+"모자람");
            }
            balance -= money;
        }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}

class BalanceInsufficientException extends Exception
{
   //public BalanceInsufficientException(){}
   public BalanceInsufficientException (String a)
   {
       super(a);
   }
}