package ch08;

abstract class Animal2
{
    String type;
    int leg;
    public Animal2(String type,int leg)
    {
        // TODO Auto-generated constructor stub
        this.type = type;
        this.leg = leg;
    }
    abstract void eat();
    abstract String sound();
}
class Dog2 extends Animal2
{

    public Dog2()
    {
        super("������", 4);
        // TODO Auto-generated constructor stub
        
    }

    @Override
    void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("������ �ִ� ��� �Դ´�.");
    }

    @Override
    String sound()
    {
        // TODO Auto-generated method stub
        return "�۸�";
    }
    
}
class Lion extends Animal2
{

    public Lion()
    {
        super("����", 4);
        // TODO Auto-generated constructor stub
    }

    @Override
    void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("�ʽĵ����� ����ؼ� �Դ´�.");
    }

    @Override
    String sound()
    {
        // TODO Auto-generated method stub
        return "����";
    }
    
}

public class AnimalEx
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Animal2[] animals = new Animal2[2];
        animals[0] = new Dog2();
        animals[1] = new Lion();
        for(Animal2 a : animals)
        {
            System.out.println(a.type + " ===>" );
            System.out.println(a.sound());
            a.eat();
        }
        
    }
    
}
