package ch06;

public class TvExam
{

    public static void main(String[] args)
    {

        String x = "d";
        // TODO Auto-generated method stub
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("현재채널 : " + t.channel);

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 채널값" + t1.channel );
        System.out.println("t2의 채널값" + t2.channel );
        t1.channel = 7;
        System.out.println("t1의 채널값" + t1.channel );

        System.out.println("t1의 채널값" + t1.channel );
        System.out.println("t2의 채널값" + t2.channel );


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
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        System.out.println(Tv.info);
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        Tv tv4= new Tv();




        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");


    }

}
