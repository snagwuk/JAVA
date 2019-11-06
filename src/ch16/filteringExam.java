package ch16;

import java.util.Arrays;
import java.util.List;

public class filteringExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List <String> names = Arrays.asList("ȫ�浿","�ſ��","���ڹ�","�ſ��","�Ź�ö");
        names.stream()
        .distinct()
        .forEach(n ->  System.out.println(n));
        System.out.println();
        
        names.stream()
        .filter(n -> n.startsWith("��"))
        .forEach(n -> System.out.println(n));
        System.out.println();
        
        names.stream()
        .distinct()
        .filter(n -> n.startsWith("��"))
        .forEach(n -> System.out.println(n));
       
    }
    
}
