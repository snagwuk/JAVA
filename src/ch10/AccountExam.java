package ch10;

public class AccountExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Account account = new Account();
        account.deposit(10000);
        System.out.println("¿¹±Ý¾× : " +  account.getBalance());
        try
        {
            account.withdraw(30000);
        }
        catch (Exception e)
        {
            // TODO: handle exception
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
    
}
