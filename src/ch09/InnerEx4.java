package ch09;
interface I
{
    void test();
}

abstract class Abs
{
    int x = 10;
    abstract void testmethod();
}
public class InnerEx4
{
    int x = 100;
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int num = 10;
        I i = new I()
                {
                    public void test()
                    {
                        int num1 = 1;
                        num1++;
                        System.out.println("interface I 객체의 test메서드임. num="+num1);
                    }
                };
                i.test();
                
                Abs a = new Abs()
                        {

                            @Override
                            void testmethod()
                            {
                                // TODO Auto-generated method stub
                                System.out.println("추상클래스 Abs 객체의 testMethod 메서드임 num=" + num);
                                System.out.println("x="+x);
                                System.out.println("InnerEx4.x="+new InnerEx4().x);
                            }
                    
                        };
                        a.testmethod();
    }
    
}
