package ch09;

public interface RemoteControl
{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    
    default void setMute(boolean mute)
    {
        if(mute)
            System.out.println("���� ó��");
        else
            System.out.println("���� ����");
    }
    static void changeBattery()
    {
        System.out.println("�������� ��ȯ�մϴ�.");
    }
}
