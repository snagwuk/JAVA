package ch14;
class UsingThis
{
    int outterField = 10;
    class Inner
    {
        int innerFiled = 20;
        void method()
        {
            MyFunctionalInterface fi = () ->
            {
                System.out.println("outterField = " +outterField);
                System.out.println("outterField = " +UsingThis.this.outterField+"\n");
                System.out.println("innerFiled = " +innerFiled);
                System.out.println("innerFiled = " +this.innerFiled+"\n");
            };
            fi.method();
        }
    }
}
public class UsingThisExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        UsingThis ut = new UsingThis();
        UsingThis.Inner in = ut.new Inner();
        in.method();
    }
    
}
