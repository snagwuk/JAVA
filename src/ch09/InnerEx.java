package ch09;

class Outer1
{
    class InstanInner 
    {
        int iv = 100;
        final static int MAX =200;
        
    }
    static class StaticInner 
    {
        int iv =300;
        static int cv = 400;
       final static int MAX=500;  
    }
    void method()
    {
        class LocalInner 
        {
            int iv = 600;
            final static int MAX=700;  
        }
        LocalInner lc = new LocalInner();
        System.out.println(lc.iv + " , " + LocalInner.MAX);
    }
    void method2()
    {
        
    }
    

}
public class InnerEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Outer1.InstanInner ii = new Outer1().new InstanInner();
        System.out.println(ii.iv);
        System.out.println(Outer1.InstanInner.MAX);
        Outer1.StaticInner si = new Outer1.StaticInner();
        System.out.println(si.iv);
        System.out.println(Outer1.StaticInner.cv);
        System.out.println(Outer1.StaticInner.MAX);
        new Outer1().method();
    }
    
}
