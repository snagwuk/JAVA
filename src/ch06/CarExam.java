package ch06;

public class CarExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car myCar = new Car("���",180);
        System.out.println("����ȸ�� : " + myCar.Company);
        System.out.println("�𵨸� : " + myCar.model);
        System.out.println("���� : " + myCar.color);
        System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
        System.out.println("����ӵ� : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("����ӵ� : " + myCar.speed);


    }

}
class Car
{

    String Company = "�����ڵ���";
    String color = "��";
    String model = "�׷���";
    int maxSpeed = 350;
    int speed;
    Car(String color, int cc)
    {
        this.color = color;
        this.speed = cc;

    }

}
