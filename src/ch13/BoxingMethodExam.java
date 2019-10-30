package ch13;

public class BoxingMethodExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        BoxM<Integer> box1 = Util.<Integer>boxing(100);
        
    }
    
}

class BoxM<T>
{
    private T t;

    public T getT()
    {
        return t;
    }

    public void setT(T t)
    {
        this.t = t;
    }
    
}
class Util 
{
    public static <T>BoxM<T> boxing(T t)
    {
        BoxM<T> box = new BoxM<T>();
        box.setT(t);
        return box;
    }
}
