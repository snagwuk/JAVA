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
        //int siv = outerlv; //staic�ܿ��� �ν��Ͻ��� outerlv������ ���� �Ҵ�Ǿ����� �ʴ�.
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
