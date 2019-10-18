package ch09_OOP;
class Outer3
{
    class InstanceInner
    {
        int iv =100;
    }
    static class StaticInner
    {
        int iv =200;
        static int cv =300;
    }
    
    void myMethod()
    {
        class LocalInner
        {
            int iv = 400;
            
        }
    }
}
public class Test4
{
    public static void main(String[] args)
    {
        Outer3 oc = new Outer3();
        Outer3.InstanceInner ii = oc.new InstanceInner();
        
        System.out.println("ii.iv : " +ii.iv );
        System.out.println("Outer3.StaticInner.cv : " + Outer3.StaticInner.cv );
        
        Outer3.StaticInner si = new Outer3.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
