package ch10;

public class FinallyTest2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        FinallyTest2.method1();
        System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿ�");
    }

    private static void method1()
    {
        // TODO Auto-generated method stub
        try
        {
            System.out.println("method1�� ȣ��Ǿ����ϴ�.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally {
            System.out.println("method1�� finally �� �Դϴ�.");
        }
    }
    
}
