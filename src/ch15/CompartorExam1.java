package ch15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CompartorExam1
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2)
            {
                // TODO Auto-generated method stub
                if (o1.price < o2.price)
                    return -1;
                else if (o1.price == o2.price) return 0;
                else return 1;
            }
        });
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        Iterator<Fruit> it = treeSet.iterator();
        while (it.hasNext())
        {
            Fruit fruit = it.next();
            System.out.println(fruit.name + "-" + fruit.price);
        }
    }
    
}


