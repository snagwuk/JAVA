package ch07;

public class InstanceofTest
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        FireEingine fe = new FireEingine();
        if(fe instanceof FireEingine)
            System.out.println("this is a FireEingine instance");
        if(fe instanceof Car2)
            System.out.println("this is a car instance");
        if(fe instanceof Object)
            System.out.println("this is a Object instance");
        System.out.println(fe.getClass().getName());
    }
    
}
class FireEingine extends Car2
{
    
}
class Car2
{
    
}
