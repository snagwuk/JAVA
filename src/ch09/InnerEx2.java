package ch09;
class Outter2
{
    private int outeriv = 10;
    private static int outercv = 20;
    class InstanceInner 
    {
        int liv = outeriv;
        int liv2 = outercv;
    }
    static class StaticInner
    {
        int siv = new Outter2().outeriv;
        static int siv2 = new Outter2().outeriv;
        static int scv = outercv;
    }
    static StaticInner si = new StaticInner();
    InstanceInner ii2 = new Outter2().new InstanceInner();
    void method(final int pv)
    {
        int i = 100;
        class LocalInner 
        {
            int liv = outeriv;
            int liv2 = outercv;
            void method()
            {
                System.out.println("pv="+pv);
                System.out.println("i="+i);
                System.out.println("liv="+liv);
                System.out.println("outercv="+outercv);
            }
        }
        LocalInner lc = new LocalInner();
    }
}
public class InnerEx2
{
    
    
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Outter2 out = new Outter2();
        out.method(1);
        Outter2.InstanceInner oic = out.new InstanceInner();
        System.out.println(oic.liv + ", "+oic.liv2 );
        Outter2.StaticInner osc = new Outter2.StaticInner();
        System.out.println(osc.siv + ", " + osc.scv + "," + osc.siv2);
    }
    
}
