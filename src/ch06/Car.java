package ch06;

public class Car
{
    String company = "�����ڵ���";
    String color = "��";
    String model = "�׷���";
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
        System.out.println("Ű�� �����ϴ�.");
    }
    void run()
    {
        for(int i = 10 ; i <= 50; i +=10)
        {
            speed = i;
            System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h");
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
