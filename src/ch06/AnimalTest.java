package ch06;

class Animal2
{

    public int age;
    public String name;

    public void eat()
    {
        // TODO Auto-generated method stub
        System.out.println("¸ÀÀÖ°Ô ¾ä¾ä");
    }


}
public class AnimalTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Animal2 a = new Animal2();
        a.name = "¿ø¼þÀÌ";
        a.age = 26;
        System.out.println(a.name + ":" + a.age + "»ì");
        a.eat();
    }

}
