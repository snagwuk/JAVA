package ch13;
class Pair<K,V>
{
    private K key;
    private V value;
    public Pair(K key , V value)
    {
        // TODO Auto-generated constructor stub
        this.key = key;
        this.value = value;
    }
    public K getKey()
    {
        return key;
    }
    public void setKey(K key)
    {
        this.key = key;
    }
    public V getValue()
    {
        return value;
    }
    public void setValue(V value)
    {
        this.value = value;
    }
}
class UtilZ
{
    public static <K,V> boolean compare(Pair<K,V> p1 , Pair<K,V> p2)
    {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
public class CompareMethodExam
{
    

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Pair<Integer, String> p1 = new   Pair<Integer, String>(1,"사과");
        Pair<Integer, String> p2 = new   Pair<Integer, String>(1,"사과");
        boolean result1 = UtilZ.<Integer, String>compare(p1, p2);
        if(result1)
            System.out.println("논리적으로 동등한 객체 입니다.");
        else 
            System.out.println("논리적으로 동등하지않은 객체입니다.");
        
        Pair<String, String> p3 = new   Pair<String, String>("user1","홍길동");
        Pair<String, String> p4 = new   Pair<String, String>("user2","홍길동");
        boolean result2 = UtilZ.<String, String>compare(p3, p4);
        if(result2)
            System.out.println("논리적으로 동등한 객체 입니다.");
        else 
            System.out.println("논리적으로 동등하지않은 객체입니다.");
        
    }
    
}
