package ch10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

class Parent
{
    void method() throws IOException
    {
        System.out.println("Parent method");
        boolean b = false;
    }
}
class Child extends Parent
{
    @Override
    void method() throws FileNotFoundException, UnknownHostException
    {
        // TODO Auto-generated method stub
     System.out.println("child method");
    }
}
public class ExceptionEx7
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Child c = new Child();
        try
        {
            c.method();
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (UnknownHostException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
