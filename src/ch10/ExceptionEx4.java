package ch10;

public class ExceptionEx4
{
    
    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        method1();
    }

     static void method1() throws Exception
    {
        // TODO Auto-generated method stub
         method2();
        
    }
     static void method2() throws Exception
    {
        // TODO Auto-generated method stub
        throw new Exception();
    }
    
}
