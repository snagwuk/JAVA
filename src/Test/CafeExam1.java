package Test;

class SutdaCard
{
    int num = 0;
    boolean ddang = false;
}
class SutdaDeck
{
    SutdaCard[] cards;
    SutdaDeck()
    {
        cards = new SutdaCard[20];

        cards[1].ddang = true;
        
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
        // System.out.println("3: " + deck.pick(0).info());
        // System.out.println("4: " + deck.pick().info());
    }
    
}
