package ch09;

public class Tv implements RemoteControl
{
 private int volume;
    
    public void turnOn()
    {
        System.out.println("TV¸¦ Åµ´Ï´Ù.");
    }
 
    @Override
    public void turnOff()
    {
        // TODO Auto-generated method stub
        System.out.println("TV¸¦ ²ü´Ï´Ù.");
    }

    @Override
    public void setVolume(int volume)
    {
        // TODO Auto-generated method stub
        if(volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else  if(volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;
        else
        {
            this.volume = volume;
            System.out.println("ÇöÀç º¼·ý : " + this.volume);
        }
                
        
    }
}
