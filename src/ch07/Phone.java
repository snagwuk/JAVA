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
        System.out.println("�������� ŵ�ϴ�.");
    }
    public void turnOff()
    {
        System.out.println("�������� ���ϴ�.");
    }
}
