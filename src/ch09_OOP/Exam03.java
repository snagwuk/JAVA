package ch09_OOP;

public class Exam03
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println(getDistance(1,1,4,5));
        System.out.println(getDistance(1,1,2,2));
    }

    private static double getDistance(int x, int y, int x1, int y1)
    {
        // TODO Auto-generated method stub
        return Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
    }
    
}
