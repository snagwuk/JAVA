package ch06;

public class TvTest2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Tv[] tvArr = new Tv[3];
        for(int i = 0 ; i < tvArr.length; i++)
        {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }

        for(int i = 0 ; i < tvArr.length; i++)
        {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].chaannel = %d%n",i,tvArr[i].channel);
        }


    }

}
