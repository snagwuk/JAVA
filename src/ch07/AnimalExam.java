package ch07;

public class AnimalExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("---");
        
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("---");
        
        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal)
    {
        // TODO Auto-generated method stub
        animal.sound();
    }
    
}
