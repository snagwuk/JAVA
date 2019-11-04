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
        map.put("½Å¿ë±Ç", 85);
        map.put("È«±æµ¿", 90);
        map.put("µ¿Àå±º", 80);
        map.put("È«±æµ¿", 95);
        System.out.println("ÃÑ entry ¼ö : " + map.size());
        System.out.println("\tÈ«±æµ¿ :"  + map.get("È«±æµ¿"));
        
        Set<String> keySet = map.keySet();
        Iterator<String > keyit = keySet.iterator();
        while(keyit.hasNext())
        {
            String key = keyit.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        
        map.remove("È«±æµ¿");
        System.out.println("ÃÑ entry ¼ö : " + map.size());
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
        System.out.println("ÃÑ entry ¼ö : " + map.size());
        
    }
    
}
