package ch06;

public class Tv
{
    String color;
    boolean power;
    int channel;
    void power(){ power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

    static String company = "Sansung";
    static String model ="LCD";
    static String info;
    String instancename = "aaa";
    static{
        info = company + "-"+model;
        System.out.println("static block");
    }
    {
        System.out.println("instance bloack");
    }
}