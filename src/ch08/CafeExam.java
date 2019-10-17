package ch08;

abstract class Animal
{
    String name;

    public void eat()
    {
        // TODO Auto-generated method stub
        
    }
}
class Dove extends Animal implements Flyable
{
    @Override
    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("��ѱ�� ���� ������ ��� �Դ´�.");
    }
    public void fly()
    {
        System.out.println("��ѱ�� ���� �ٴϴ� ���Դϴ�.");
    }
}
class Monkey extends Animal
{
    @Override
    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("�����̴� �������� ���Ÿ� ���� �Դ´�.");
    }
}
class Eagle extends Animal implements Flyable
{
    @Override
    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("�������� ���� ���� ��� �Դ´�.");
    }
    public void fly()
    {
        System.out.println("�������� ��û ���� ���� �ٴѴ�.");
    }
}

interface Flyable
{

    void fly();
    
}

public class CafeExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Animal[] arr = new Animal[3];
        arr[0] = new Dove();
        arr[1] = new Monkey();
        arr[2] = new Eagle();
        for(Animal a : arr)
        {
            a.eat();
            if(a instanceof Flyable)
            {
                ((Flyable) a).fly();
            }
        }
        
    }
    
}
