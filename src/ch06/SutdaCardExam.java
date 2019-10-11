package ch06;
class SutdaCard
{
    int number;
    boolean isKwang;

    SutdaCard()
    {
        this.number = 1;
        isKwang= true;
    }
    SutdaCard(int number, boolean isKwang)
    {
        this.number = number;
        this.isKwang = isKwang;
    }

    public String info()
    {
        // TODO Auto-generated method stub
        return !isKwang ? number+"" : number+"K";
    }

}
public class SutdaCardExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());

    }

}
