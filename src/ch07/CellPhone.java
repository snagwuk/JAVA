package ch07;

public class CellPhone
{
    String model;
    String color;

    void powerOn()
    {
        System.out.println("������ ŵ�ϴ�.");
    }
    void powerOff()
    {
        System.out.println("������ ���ϴ�.");
    }
    void bell()
    {
        System.out.println("���� �︳�ϴ�.");
    }
    void sendVoice(String mess)
    {
        System.out.println("�ڱ� : " + mess);
    }
    void receiveVoice(String mess)
    {
        System.out.println("���� : " + mess);
    }
    void hangUp()
    {
        System.out.println("��ȭ�� �����ϴ�.");
    }


}
