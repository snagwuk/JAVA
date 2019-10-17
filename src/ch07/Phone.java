package ch07;

public abstract class Phone
{
    public String owner;
    public Phone(String owner)
    {
        this.owner = owner;
    }
    public void turOn()
    {
        System.out.println("폰전원을 킵니다.");
    }
    public void turnOff()
    {
        System.out.println("폰전원을 끕니다.");
    }
}
