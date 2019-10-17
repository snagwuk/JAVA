package ch09_OOP;

public class Exam09
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int value = 5;
        System.out.println(value + "의 절대값 : " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 : " + abs(value));
    }

    private static int abs(int value)
    {
        if(value < 0)
            value = -value;
        return value;
    }
    
}
