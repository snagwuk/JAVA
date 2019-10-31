package ch13;

interface product
{
    
}
class Car implements product
{
    public String toString()
    {
        return "Car []";
    }
}
class Tv implements product
{
    public String toString(){return "Tv []";}
}
class AppleZ {}
public class GenericInterfaceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        compare(new Car(), new Tv());
        //compare(new Apple(), new Tv());
        
    }

    private static<T extends product > void compare(T t1, T t2)
    {
        // TODO Auto-generated method stub
        System.out.println(t1+":"+t2);
        
    }
    
}
