package ch10;

public class ExceptionEx3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println(1);
        System.out.println(2);

        try
        {
         
            
            System.out.println(3);
            //System.out.println(0/0);
            System.out.println(4); // ������� �ʴ´�.
            Exception e = new Exception("���Ƿι߻�");
            throw e;
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(5);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(6);
    }
    
}
