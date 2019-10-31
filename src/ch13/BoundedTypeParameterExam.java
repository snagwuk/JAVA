package ch13;

public class BoundedTypeParameterExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int res1 = UtilBTP.compare(10, 20);
        System.out.println(res1);
        int res2 = UtilBTP.compare(4.5, 3);
        System.out.println(res2);
    }
    
}
class UtilBTP
{
    public static <T extends Number> int compare(T t1, T t2)
    {
        double v1 = t1. doubleValue();
        double v2 = t2. doubleValue();
        return Double.compare(v1, v2);
        
    }
}
