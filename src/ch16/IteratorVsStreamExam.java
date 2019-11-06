package ch16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> list = Arrays.asList("È«±æµ¿","½Å¿ë±Ç","±èÀÚ¹Ù");
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext())
        {
            String name = it.next();
            System.out.println(name);
        }
        System.out.println();
        
        Stream<String> stream = list.stream();
        stream.forEach(a ->  System.out.println(a));
   }
    
}
