package ch07;

class SutdaCard
{
    int num;
    boolean ddang;
     public String info()
    {
        // TODO Auto-generated method stub
        return !ddang ? num+"" : num+"K";
    }


}
class SutdaDeck
{
    SutdaCard[] cards = new SutdaCard[20];;
    SutdaDeck()
    {
        for (int i = 0; i < 20; i++)    
            cards[i] = new SutdaCard();
        
        for (int i = 0; i < 10; i++)
        {       
           cards[i].num = cards[i+10].num = i+1;
            if ( ((i + 1) == 1) || ((i + 1) == 3) || ((i + 1) == 8))
                cards[i].ddang = true;
        }
    }
    public void shuffle()
    {
        for(int i =0; i < cards.length; i++)
        {
            int r = (int) (Math.random()*20);
            SutdaCard tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;            
        }
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        String result = "";
        for(SutdaCard sc : cards)
        {
            if(sc.ddang)
                result += sc.num +"K, ";
            else
                result += sc.num +", ";
        }
        return result;
    }
    public SutdaCard pick(int index)
    {
        // TODO Auto-generated method stub
        return cards[index];
    }
    public SutdaCard pick()
    {
        // TODO Auto-generated method stub
        int index = (int) (Math.random()*20);
        return cards[index];
    }
}

public class CafeExam1
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SutdaDeck deck = new SutdaDeck();
        System.out.println("1: " + deck.toString());
        deck.shuffle();
        System.out.println("2: " + deck);
        System.out.println("3: " + deck.pick(0).info());
        System.out.println("4: " + deck.pick().info());
    }
    
}
