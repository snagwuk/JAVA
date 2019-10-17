package ch07;


class Card3
{
    final String type;
    final int number;
    
    Card3(){ this("Spade",1);}
    Card3(String type , int number)
    {
        this.type = type;
        this.number = number;
    }
}
public class FinalEx2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Card3 c1 = new Card3();
        System.out.println(c1.type+", " + c1.number);
        
        Card3 c2 = new Card3("CLOVER",2);
        System.out.println(c2.type+", " + c2.number);
    }
    
}
