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
            System.out.println("main�޼ҵ忡�� ����ó���� �Ǿ����ϴ�.");
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
            System.out.println("methoe1���� ���ܰ� ó���Ǿ�����.");
            // TODO: handle exception
            throw e;
        }
        
    }
}
