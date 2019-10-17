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
        System.out.println("비둘기는 작은 벌레를 잡아 먹는다.");
    }
    public void fly()
    {
        System.out.println("비둘기는 날아 다니는 새입니다.");
    }
}
class Monkey extends Animal
{
    @Override
    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("원숭이는 나무에서 열매를 따서 먹는다.");
    }
}
class Eagle extends Animal implements Flyable
{
    @Override
    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("독수리는 작은 새를 잡아 먹는다.");
    }
    public void fly()
    {
        System.out.println("독수리는 엄청 높이 날아 다닌다.");
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
