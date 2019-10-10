package ch07;

public class CellPhoneDmb extends CellPhone
{

    int channel;

    CellPhoneDmb(String model, String color, int channel)
    {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb()
    {
        System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel)
    {
        this.channel = channel;
        System.out.println("채널 " + channel + "번 으로 바꿉니다.");
    }
    void turnOffDmb()
    {
        System.out.println(" DMB방송 수신을 중지합니다.");
    }


}
