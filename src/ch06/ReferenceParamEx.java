package ch06;

public class ReferenceParamEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] x = {10};
        System.out.println(x[0]);
        change(x);
        System.out.println(x[0]);

    }
    static void change(int[] x)
    {
        x[0] = 1000;
    }

}
