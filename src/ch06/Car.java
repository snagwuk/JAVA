package ch06;

import hankook.SnowTire;
import hydai.Engine;
import kumho.BigWidthTire;

public class Car
{

    private int speed2;
    private boolean stop;


    public int getSpeed2()
    {
        return speed2;
    }
    public void setSpeed2(int speed2)
    {
        this.speed2 = speed2;
    }
    public boolean isStop()
    {
        return stop;
    }
    public void setStop(boolean stop)
    {
        this.stop = stop;
    }

    SnowTire st = new SnowTire();
    BigWidthTire bwt = new BigWidthTire();
    Engine eg = new Engine();

    hankook.SnowTire tire3 = new hankook.SnowTire();
    kumho.BigWidthTire tire4 = new kumho.BigWidthTire();


    String company = "현대자동차";
    String color = "블랙";
    String model = "그랜져";
    int maxSpeed = 350;
    int speed;

    int getSpeed()
    {
        return speed;
    }
    void setSpeed(int speed)
    {
        this.speed = speed;
    }
    void keyTurnOn()
    {
        System.out.println("키를 돌립니다.");
    }
    void run()
    {
        for(int i = 10 ; i <= 50; i +=10)
        {
            speed = i;
            System.out.println("달립니다.(시속:" + speed + "km/h");
        }
    }

    Car(){ }
    Car(String model) { this(model,null,0);}
    Car(String model, String color) { this(model,color,0);}
    Car(String model, String color,int maxSpeed) { this.model = model; this.color = color; this.maxSpeed = maxSpeed;}
    Car(String model, int maxSpeed) { this.model = model; this.maxSpeed = maxSpeed;}

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
