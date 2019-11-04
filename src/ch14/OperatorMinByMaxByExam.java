package ch14;

import java.util.function.BinaryOperator;

class Fruit
{
    String name;
    int price;
    public Fruit(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
}
public class OperatorMinByMaxByExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        BinaryOperator<Fruit> bo;
        Fruit fr;
        bo = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.price, f2.price));
        fr = bo.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
        System.out.println(fr.name);
        bo = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.price, f2.price));
        fr = bo.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
        System.out.println(fr.name);
    }
    
}
