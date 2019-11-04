package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("java");
        set.add("iBATIS");
        int size = set.size();
        System.out.println("ÃÑ °´Ã¼¼ö : " + size);
        
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            String element = it.next();
            System.out.println("\t" + element);
            
        }
        set.remove("JDBC");
        set.remove("iBATIS");
        System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
        for(String element : set)
        {
            System.out.println("\t" + element);
            
        }
        set.clear();
        if(set.isEmpty())
            System.out.println("ºñ¾î ÀÖÀ½");
        
    }
    
}
