package ch06;

public class Car
{
    String company = "�����ڵ���";
    String color = "��";
    String model = "�׷���";
    int maxSpeed = 350;
    int speed;

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
