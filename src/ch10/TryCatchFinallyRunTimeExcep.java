package ch10;

public class TryCatchFinallyRunTimeExcep
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String data1 = null;
        String data2 = null;
        try
        {
            data1 = args[0]; 
            data2 = args[1]; 
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("실행매개값의  수가 부족합니다 . \n [실행방법]\n java TryCatchFinallyRunTimeExcep 값1 값2");
            // TODO: handle exception
        }
        finally {
            System.out.println("다시실행해보세요");
            
        }
    }
    
}
