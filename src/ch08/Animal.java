package ch08;

public abstract class Animal
{
   public String kind;
   public void breathe()
   {
       System.out.println("¼ûÀ» ½±´Ï´Ù.");
   }
   public abstract void sound();
}
class Cat extends Animal
{
    public Cat(){
        this.kind = "Ç¥À¯·ù";
    }
    @Override
    public void sound()
    {
        // TODO Auto-generated method stub
        System.out.println("¾ß¿Ë");
    }
}
class Dog extends Animal
{
    public Dog(){
        this.kind = "Ç¥À¯·ù";
    }
    @Override
    public void sound()
    {
        // TODO Auto-generated method stub
        System.out.println("¸Û¸Û");
    }
}

