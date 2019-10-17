package ch08;

interface Searchable
{
    void search(String url);
}

public class SmartTv implements RemoteControl, Searchable
{
    private int volume;
    
    public void turnOn()
    {
        System.out.println("TV�� ŵ�ϴ�.");
    }
    
    @Override
    public void turnOff()
    {
        // TODO Auto-generated method stub
        System.out.println("TV�� ���ϴ�.");
    }
    
    @Override
    public void setVolume(int volume)
    {
        // TODO Auto-generated method stub
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;
        else
        {
            this.volume = volume;
            System.out.println("���� ���� : " + this.volume);
        }
        
    }
    
    @Override
    public void search(String url)
    {
        // TODO Auto-generated method stub
        System.out.println(url + "�˻��մϴ�.");
        
    }
}
