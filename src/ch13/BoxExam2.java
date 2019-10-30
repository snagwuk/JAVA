package ch13;

public class BoxExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        BoxT<String> box1 = new  BoxT<String>();
        box1.set("hello");
        String str = box1.get();
        BoxT<Integer> box2 = new  BoxT<Integer>();
        box2.set(6);
        int v = box2.get();
        
    }
    
}
class BoxT<T>
{
    private T t;
    T get()
    {
        return t;
    }
    void set(T t)
    {
        this.t =t;
    }
}