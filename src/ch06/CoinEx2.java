package ch06;
class Coin2
{
    int side;
    public void flip()
    {
        // TODO Auto-generated method stub
        side = (int) (Math.random() * 2);
    }

}
public class CoinEx2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Coin2 mycoin = new Coin2();
        Coin2 youcoin = new Coin2();
        int mycnt = 0 ;
        int youcnt = 0;
        System.out.println("mycoin\tyoucoin");

        while(true)
        {
            mycoin.flip();
            youcoin.flip();
            if(mycoin.side == 0)
            {
                System.out.print("�ո�\t");
                mycnt++;
            }
            else
                System.out.print("�޸�\t");

            if(youcoin.side == 0)
            {
                System.out.print("�ո�\n");
                youcnt++;
            }
            else
                System.out.print("�޸�\n");

            if(mycnt == 3 || youcnt == 3)
                break;

        }
        if(mycnt > youcnt)
            System.out.println("mycoin �¸�");
        else if (mycnt < youcnt)
            System.out.println("youcoin �¸�");
        else
            System.out.println("���� ���");


    }

}
