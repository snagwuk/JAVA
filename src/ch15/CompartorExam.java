package ch15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CompartorExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Fruit> treeSet = new  TreeSet<Fruit> (new DescendingComparator());
        treeSet.add(new Fruit("����", 3000));
        treeSet.add(new Fruit("����",10000));
        treeSet.add(new Fruit("����", 6000));
        Iterator<Fruit> it = treeSet.iterator();
        while(it.hasNext())
        {
            Fruit fruit = it.next();
            System.out.println(fruit.name + "-" + fruit.price);
        }
        }
    
}
class Fruit 
{
    String name;
    int price;
    public Fruit(String name, int price)
    {
        super();
        this.name = name;
        this.price = price;
    }
}
class DescendingComparator implements Comparator<Fruit>
{

    @Override
    public int compare(Fruit o1, Fruit o2)
    {
        // TODO Auto-generated method stub
        if(o1.price < o2.price) return 1;
        else  if(o1.price == o2.price) return 0;
        else return -1;
    }
    
}