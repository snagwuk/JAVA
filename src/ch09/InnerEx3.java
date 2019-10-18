package ch09;
class Outter3
{
    int iv =10;
    int in2 = 20;
    class InstanceInner
    {
        int iv = 100;
        void method()
        {
            int iv = 200;
            System.out.println("iv=" + iv );
            System.out.println("this.iv=" + this.iv );
            System.out.println("Outer3.this.iv=" + iv );
        }
    }
}
public class InnerEx3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Outter3 out = new Outter3();
        Outter3.InstanceInner oic = out.new InstanceInner()                                                                                                                                                                                     ;
        oic.method();
    }
    
}
