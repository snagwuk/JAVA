package ch06;
class Tv
{
    String color;
    boolean power;
    int channel;
    void power(){ power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
public class TvTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재채널 : " + t.channel);

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 채널값" + t1.channel );
        System.out.println("t2의 채널값" + t2.channel );
        t1.channel = 7;
        System.out.println("t1의 채널값" + t1.channel );

        System.out.println("t1의 채널값" + t1.channel );
        System.out.println("t2의 채널값" + t2.channel );


    }

}
