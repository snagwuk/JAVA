package ch10;

public class ThrowsExam
{
    
    public ThrowsExam()
    {
        // TODO Auto-generated constructor stub
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            findclass();
        }
        catch (ClassNotFoundException e)
        {
            // TODO: handle exception
            System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
        }
    }

    private static void findclass() throws ClassNotFoundException
    {
        // TODO Auto-generated method stub
        Class clazz = Class.forName("java.lang.String2");
        
    }
    
}
