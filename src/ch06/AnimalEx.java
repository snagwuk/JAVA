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
        System.out.println(animal + ":" + age+"살");
    }
}
public class AnimalEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Animal a1 = new Animal("원숭이",26);
        a1.info();
        Animal a12 = new Animal("강아지",1);
        a12.info();
        Animal a123 = new Animal("사람",20);
        a123.info();


    }

}
