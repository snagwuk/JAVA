package ch06;

public class OverLoadingTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MyMath m = new MyMath();
        System.out.println("m.add(3,3) = "+ m.add(3,3));
        System.out.println("m.add(3L,3) = "+ m.add(3L,3));
        System.out.println("m.add(3,3L) = "+ m.add(3,3L));
        System.out.println("m.add(3L,3L) = "+ m.add(3L,3L));
        int [] a = {100,20,300};
        System.out.println("m.add(3,3) = "+ m.add(a));

    }

}

class MyMath
{
    int add(int a, int b)
    {
        System.out.println("int add(int a, int b) - ");
        return a+b;
    }
    long add(int a, long b)
    {
        System.out.println("long add(int a, long b) - ");
        return a+b;
    }
    long add(long a, int b)
    {
        System.out.println("long add(long a, int b) - ");
        return a+b;
    }
    long add(long a, long b)
    {
        System.out.println("long add(long a, long b) - ");
        return a+b;
    }
    int add(int[] a)
    {
        System.out.println(" int add(int[] a) - ");
        int result = 0;
        for(int x : a)
            result += x;
        return result;
    }
}