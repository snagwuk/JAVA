package ch10;

public class ClassCastExcep
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Dog dog = new Dog();
        Cat cat = new Cat();
        changeDog(dog);
        changeDog(cat);
    }

    private static void changeDog(Animal ani)
    {
        // TODO Auto-generated method stub
        Dog dog = (Dog)ani;
    }
    
}
class Dog extends Animal{}
class Cat extends Animal{}
class Animal {}
