package ch06;

public class CarExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car myCar = new Car("���",180);
        System.out.println("����ȸ�� : " + myCar.company);
        System.out.println("�𵨸� : " + myCar.model);
        System.out.println("���� : " + myCar.color);
        System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
        System.out.println("����ӵ� : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("����ӵ� : " + myCar.speed);

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        Car car2 = new Car("�ڰ���");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);

        Car car3 = new Car("�ڰ���","����");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        Car car4 = new Car("�ý�","����",200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        Car myCar2 = new Car();
        myCar2.keyTurnOn();
        myCar2.run();
        int speed = myCar2.getSpeed();
        System.out.println("����ӵ� : " + speed + "km/h");
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

        Car car11 = new Car("������");
        Car car12 = new Car("����");

        car11.run();
        System.out.println(car11.speed + ":" + car12.speed);
        car12.run();
        System.out.println(car11.speed + ":" + car12.speed);

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door  = 4;
        Car c2 = new Car("white","auto",4);
        System.out.println("c1 = " +  c1.color +  c1.gearType +  c1.door );
        System.out.println("c2 = " +  c2.color +  c2.gearType +  c2.door );

    }

}
/*
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
}*/
