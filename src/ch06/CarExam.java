package ch06;

public class CarExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Car myCar = new Car("블루",180);
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("현재속도 : " + myCar.speed);

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);

        Car car3 = new Car("자가용","빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        Car car4 = new Car("택시","검정",200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        Car myCar2 = new Car();
        myCar2.keyTurnOn();
        myCar2.run();
        int speed = myCar2.getSpeed();
        System.out.println("현재속도 : " + speed + "km/h");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Car car11 = new Car("포르쉐");
        Car car12 = new Car("벤츠");

        car11.run();
        System.out.println(car11.speed + ":" + car12.speed);
        car12.run();
        System.out.println(car11.speed + ":" + car12.speed);

    }

}
/*
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
}*/
