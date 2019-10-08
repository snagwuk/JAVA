package ch06;

public class PrimitiveParamEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Data d = new Data();
        d.x = 10;
        System.out.println("main(String[] args) : x = " + d.x);
        change(d.x);
        System.out.println("change(d.x)");
        System.out.println("main(String[] args) : x = " + d.x);

        change(d);
        System.out.println("change(d)");
        System.out.println("main(String[] args) : x = " + d.x);




    }

    static void change(int x)
    {
        // TODO Auto-generated method stub
        x = 1000;

    }
    static void change(Data d)
    {
        // TODO Auto-generated method stub
        d.x = 10000;
    }

}
class Data
{
    int x;
}
