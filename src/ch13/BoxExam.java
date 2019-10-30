package ch13;
class Box
{
    private Object obj;
    void set (Object obj)
    {
        this.obj = obj;
    }
    Object get()
    {
        return obj;
    }
}
class Apple
{
    
}
public class BoxExam
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Box box = new Box();
        box.set("ȫ�浿");
        String name = (String) box.get();
        
        box.set(new Apple());
        Apple apple = (Apple) box.get();
        
    }
    
}
