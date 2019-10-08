package ch06;
class Number1
{
    int num;

}
class Number2
{
    int num;
    Number2(int num)
    {
        this.num = num;
    }
}
public class ConstructorEx1
{
    public static void main(String[] args)
    {
        Number1 n1 = new Number1();
        n1.num  =100;
        System.out.println(" n1.num = " +  n1.num );
        Number2 n2 = new Number2(100);
        System.out.println(" n2.num = " +  n2.num );


    }
}
