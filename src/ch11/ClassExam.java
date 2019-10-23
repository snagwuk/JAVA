package ch11;
class Car
{
    
}
public class ClassExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car car = new Car();
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();
        
        try
        {
            Class clazz2 = Class.forName("ch11.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        }
        catch (ClassNotFoundException e)
        {
            // TODO: handle exception
            e.printStackTrace();
            }
    }
    
}
