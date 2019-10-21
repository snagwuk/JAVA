package ch10;

public class TryCatchFinallyExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            Class clazz = Class.forName("JAva.lang.String2");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println("클래스가 존재하지않습니다.");
        }
    }
    
}
