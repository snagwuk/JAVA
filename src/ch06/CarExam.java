package ch06;

public class CarExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car myCar = new Car("블루",180);
        System.out.println("제작회사 : " + myCar.Company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("현재속도 : " + myCar.speed);


    }

}
class Car
{

    String Company = "현대자동차";
    String color = "블랙";
    String model = "그랜져";
    int maxSpeed = 350;
    int speed;
    Car(String color, int cc)
    {
        this.color = color;
        this.speed = cc;

    }

}
