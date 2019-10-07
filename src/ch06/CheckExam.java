package ch06;

public class CheckExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
class printer
{
    static void println(int x)    {        System.out.println(x);    }
    static void println(String x)    {        System.out.println(x);    }
    static void println(boolean x)    {        System.out.println(x);    }
    static void println(double x)    {        System.out.println(x);    }


}
class ShopService
{
    private static ShopService s1 = new ShopService();

    private ShopService(){}

    static ShopService getInstance()
    {
        return s1;
    }
}

class Account
{
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    private int balance;
    public int getBalance()
    {
        return balance;
    }
    public void setBalance(int balance)
    {
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            this.balance += balance;

    }


}

