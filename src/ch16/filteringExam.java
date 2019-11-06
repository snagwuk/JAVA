package ch16;

import java.util.Arrays;
import java.util.List;

public class filteringExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List <String> names = Arrays.asList("È«±æµ¿","½Å¿ë±Ç","±èÀÚ¹Ù","½Å¿ë±Ç","½Å¹ÎÃ¶");
        names.stream()
        .distinct()
        .forEach(n ->  System.out.println(n));
        System.out.println();
        
        names.stream()
        .filter(n -> n.startsWith("½Å"))
        .forEach(n -> System.out.println(n));
        System.out.println();
        
        names.stream()
        .distinct()
        .filter(n -> n.startsWith("½Å"))
        .forEach(n -> System.out.println(n));
       
    }
    
}
