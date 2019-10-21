package ch10;

public class ExceptionEx5
{
    public static void main(String[] args) 
    {
        try
        {
            method1();
        }
        catch (Exception e)
        {
            System.out.println("main메소드에서 예외처리가 되었습니다.");
        }
    }

    private static void method1() throws Exception
    {
        // TODO Auto-generated method stub
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println("methoe1에서 예외가 처리되었습니.");
            // TODO: handle exception
            throw e;
        }
        
    }
}
