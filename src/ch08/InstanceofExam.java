package ch08;

public class InstanceofExam
{
   
    
    public static void method1(Parentz parent)
    {
        if(parent instanceof Child2)
        {
            @SuppressWarnings("unused")
            Child2 child = (Child2)parent;
            System.out.println("mthode1 - Child로 변환성공 ");
        }
        else
            System.out.println("mthode1 - Child로 변환돠지않음 ");
    }
    public static void method2(Parentz parent)
    {
        @SuppressWarnings("unused")
        Child2 child = (Child2)parent;
        System.out.println("mthode2- Child로 변환성공 ");
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
       Parentz parentA = new Child2();
       method1(parentA); method2(parentA);
       
       Parentz parentB = new Parentz();
       method1(parentB); method2(parentB);
       
        
    }
  
    
}
class Child2 extends Parentz
{
}

class Parentz
{
    
}