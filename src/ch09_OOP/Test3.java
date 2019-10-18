package ch09_OOP;

class InnerEx23
{
    private int outerlv = 0;
    static int outerCv = 0;
    
    class InstanceInner 
    {
        int iiv = outerlv;
        int iiv2 = outerCv;
    }
    static class StaticInner
    {
        //int siv = outerlv; //staic단에서 인스턴스인 outerlv변수는 현재 할당되어있지 않다.
        static int scv = outerCv;
    }
    void myMethod()
    {
        int lv = 0;
        final int LV = 0;
        lv = 5;
        class LocalInner
        {
            int liv = outerlv;
            int liv2 = outerCv;
            // int liv3 = lv;
            int liv4 = LV;
        }
    }
    
}
public class Test3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }
    
}
