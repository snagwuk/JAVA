package ch06;
class Phone
{

    public String color;
    public boolean power;
    public String no;
    public void send(String string)
    {
        // TODO Auto-generated method stub
        System.out.println(string+"로 전화 송신 중");

    }
    public void receive(String string)
    {
        // TODO Auto-generated method stub
        System.out.println(string+"에서 전화 수신 중");

    }

}
public class PhoneEx1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Phone p1;
        p1 = new Phone();
        p1.color = "검정";
        p1.power = true;
        p1.no = "01013456789";
        System.out.println(p1.color + "," + p1.power+","+p1.no  );
        p1.send("01012341234");
        p1.receive("01012341234");

        Phone p2 = new Phone();
        p2 = p1;
        System.out.println(p2.color + "," + p2.power+","+p2.no  );
}
}

