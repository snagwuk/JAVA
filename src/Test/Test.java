package Test;

class Parent {}
class Child extends Parent {}
public class Test
{
    public static void main(String[] args)
    {
        Parent p = new Child(); //�ڵ�Ÿ�Ժ�ȯ
        Child c = (Child) p;    //����Ÿ�Ժ�ȯ(Casting)
        
        Parent p2 = new Parent(); 
        Child c2 = (Child) p2;    //����Ÿ�Ժ�ȯ(Casting) ����!!
        
        System.out.println(c+""+c2);
    }
    
}
