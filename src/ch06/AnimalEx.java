package ch06;
class Animal
{
    String animal;
    int age;

    Animal(){}
    Animal(String animal, int age )
    {
        this.animal = animal;
        this.age = age;

    }

    void info()
    {
        System.out.println(animal + ":" + age+"��");
    }
}
public class AnimalEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Animal a1 = new Animal("������",26);
        a1.info();
        Animal a12 = new Animal("������",1);
        a12.info();
        Animal a123 = new Animal("���",20);
        a123.info();


    }

}
