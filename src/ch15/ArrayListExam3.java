package ch15;

import java.nio.file.WatchEvent.Kind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Animal
{
    String kind;

    public Animal(String kind)
    {
        super();
        this.kind = kind;
    }
    abstract void sound();
}
class Cat extends Animal
{

    public Cat(String kind)
    {
        super(kind);
        // TODO Auto-generated constructor stub
    }

    @Override
    void sound()
    {
        // TODO Auto-generated method stub
        System.out.print("�߿�");
    }
   
    
}
class Dog extends Animal
{

    public Dog(String kind)
    {
        super(kind);
        // TODO Auto-generated constructor stub
    }

    @Override
    void sound()
    {
        // TODO Auto-generated method stub
        System.out.print("�۸�");
    }
    
}
public class ArrayListExam3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Animal> li = new ArrayList<Animal>();
        li.add(new Dog("�߻� ������"));
        li.add(new Dog("���� ������"));
        li.add(new Dog("���� ������"));
        li.add(new Cat("�� �����"));
        li.add(new Cat("�ٹ� �����"));
        li.add(new Cat("��� �����"));
        
        /*Collections.sort(li, new Comparator<Animal>() {

            @Override
            public int compare(Animal o1, Animal o2)
            {
                // TODO Auto-generated method stub
                return o1.kind.compareTo(o2.kind)* -1;
            }
            
            
        });*/
        
        
        Collections.sort(li, (o1,o2) -> o1.kind.compareTo(o2.kind));
        
        
        
        
        
        
        
        for(Animal a : li)
        {
            System.out.print(a.kind + ":");
            a.sound();
            System.out.println();
        }
    }
    
}
