package ch11;

import java.util.HashMap;

public class KeyExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        HashMap<Key, String> hashmap = new  HashMap<Key, String>();
        
        hashmap.put(new Key(1), "ȫ�浿");
        hashmap.put(new Key(1), "ȫ�浿1");
        
        System.out.println(hashmap.size());
        
        String value = hashmap.get(new Key(1));
        System.out.println(value);
        
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());
    }
    
}
