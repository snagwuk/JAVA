package ch09;

public interface ParentInteface
{
    public void method1();
    public default void method2()
    {
        System.out.println("ParentInteface - method2");
    };
}
interface chileinterface1 extends ParentInteface
{
    public void method3();
}
interface chileinterface2 extends ParentInteface
{
    public default void method2()
    {
        System.out.println("chileinterface2 - method2");
    };
    public void method3();
}
interface chileinterface3 extends ParentInteface
{
    public void method2();
    public void method3();
}
