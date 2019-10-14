package ch08;

public abstract class Animal
{
   public String kind;
   public void breathe()
   {
       System.out.println("���� ���ϴ�.");
   }
   public abstract void sound();
}
class Cat extends Animal
{
    public Cat(){
        this.kind = "ǥ����";
    }
    @Override
    public void sound()
    {
        // TODO Auto-generated method stub
        System.out.println("�߿�");
    }
}
class Dog extends Animal
{
    public Dog(){
        this.kind = "ǥ����";
    }
    @Override
    public void sound()
    {
        // TODO Auto-generated method stub
        System.out.println("�۸�");
    }
}

