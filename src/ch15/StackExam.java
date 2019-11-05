package ch15;

import java.util.Stack;

public class StackExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Stack<Coin> coinBox = new   Stack<Coin>();
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(500));
        while(!coinBox.isEmpty())
        {
            System.out.println("²¨³»¿Â ÄÚÀÎ : " + coinBox.pop().getValue());
        }
    }
    
}
class Coin
{
    int value;

    public Coin(int value)
    {
        super();
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    };
    
    
}