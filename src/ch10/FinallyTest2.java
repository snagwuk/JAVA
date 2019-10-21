package ch10;

public class FinallyTest2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        FinallyTest2.method1();
        System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴");
    }

    private static void method1()
    {
        // TODO Auto-generated method stub
        try
        {
            System.out.println("method1이 호출되었습니다.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally {
            System.out.println("method1의 finally 블럭 입니다.");
        }
    }
    
}
