package ch07;
class Card2
{
    final int NUMBER;
    final String KIND;
    Card2(String kind, int num)
    {
        KIND = kind;
        NUMBER = num;
    }
    Card2()
    {
        this("HEART",1);
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return KIND + " " + NUMBER;
    }
    
}
public class FinalCardTest
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Card2 c = new Card2("HEART",10);
        
        System.out.println(c.KIND) ;
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
    
}
