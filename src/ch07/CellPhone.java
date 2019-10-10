package ch07;

public class CellPhone
{
    String model;
    String color;

    void powerOn()
    {
        System.out.println("전원을 킵니다.");
    }
    void powerOff()
    {
        System.out.println("전원을 끕니다.");
    }
    void bell()
    {
        System.out.println("벨이 울립니다.");
    }
    void sendVoice(String mess)
    {
        System.out.println("자기 : " + mess);
    }
    void receiveVoice(String mess)
    {
        System.out.println("상대방 : " + mess);
    }
    void hangUp()
    {
        System.out.println("전화를 끊습니다.");
    }


}
