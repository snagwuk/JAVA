package ch16;

import java.util.Arrays;
import java.util.List;

public class FlatMapExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> inputList1 = Arrays.asList("java8 lamda","stream mapping");
        inputList1.stream()
        .flatMap(data -> Arrays.stream(data.split(" ")))
        .forEach(word -> System.out.println(word));
        
       
        System.out.println();
        
        List<String> inputList2 = Arrays.asList("10, 20, 30","40, 50, 60");
        inputList2.stream()
        .flatMapToInt(data -> {
            String[] starr = data.split(",");
            int[] intarr = new int[starr.length];
            for(int  i = 0 ;  i < starr.length;i++)
            {
                intarr[i] = Integer.parseInt(starr[i].trim());
            }
            return Arrays.stream(intarr);
        })
        .forEach(n -> System.out.println(n));
    }
    
}
