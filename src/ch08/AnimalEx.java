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
        super("강아지", 4);
        // TODO Auto-generated constructor stub
        
    }

    @Override
    void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("주인이 주는 대로 먹는다.");
    }

    @Override
    String sound()
    {
        // TODO Auto-generated method stub
        return "멍멍";
    }
    
}
class Lion extends Animal2
{

    public Lion()
    {
        super("사자", 4);
        // TODO Auto-generated constructor stub
    }

    @Override
    void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("초식동물을 사냥해서 먹는다.");
    }

    @Override
    String sound()
    {
        // TODO Auto-generated method stub
        return "어흥";
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
