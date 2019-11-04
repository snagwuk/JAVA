package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("�ſ��", 85);
        map.put("ȫ�浿", 90);
        map.put("���屺", 80);
        map.put("ȫ�浿", 95);
        System.out.println("�� entry �� : " + map.size());
        System.out.println("\tȫ�浿 :"  + map.get("ȫ�浿"));
        
        Set<String> keySet = map.keySet();
        Iterator<String > keyit = keySet.iterator();
        while(keyit.hasNext())
        {
            String key = keyit.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        
        map.remove("ȫ�浿");
        System.out.println("�� entry �� : " + map.size());
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> enntryIterator = entrySet.iterator();
        
        while(enntryIterator.hasNext())
        {
            Map.Entry<String, Integer> entry = enntryIterator.next();
            String key = entry.getKey();
            Integer calse = entry.getValue();
            System.out.println("\t" + key + ":" + calse);
            
        }
        System.out.println();
        map.clear();
        System.out.println("�� entry �� : " + map.size());
        
    }
    
}
