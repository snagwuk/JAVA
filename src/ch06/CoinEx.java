package ch06;
class Coin
{

    int side;

    void flip()
    {
        // TODO Auto-generated method stub
        side = (int)(Math.random()*2);
    }

}
public class CoinEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Coin coin = new Coin();
        coin.flip();
        switch(coin.side)
        {
            case 0: System.out.println("¾Õ¸é");break;
            case 1: System.out.println("µÞ¸é");break;
        }

    }

}
