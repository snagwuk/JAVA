package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx4
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] data = {"A","K","A","K","D","K","A","K","K","Z","D"};
        HashMap<String,Integer> map = new  HashMap<String,Integer>();
        for(int i = 0 ; i < data.length; i ++)
        {
            if(map.containsKey(data[i]))
            {
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(value.intValue()+1));
                
            }
            else
                map.put(data[i], new Integer(1));
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String, Integer> entry = it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + ":" + printBar('#',value) + " " + value);
        }
    }

    private static String printBar(char ch, int value)
    {
        // TODO Auto-generated method stub
        char[] bar = new char[value];
        for(int i = 0 ; i <bar.length; i++)
        {
            bar[i] = ch;
        }
        return new String(bar);

    }
    
}
