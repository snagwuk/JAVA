package Test;

class Parent {}
class Child extends Parent {}
public class Test
{
    public static void main(String[] args)
    {
        Parent p = new Child(); //자동타입변환
        Child c = (Child) p;    //강제타입변환(Casting)
        
        Parent p2 = new Parent(); 
        Child c2 = (Child) p2;    //강제타입변환(Casting) 오류!!
        
        System.out.println(c+""+c2);
    }
    
}
