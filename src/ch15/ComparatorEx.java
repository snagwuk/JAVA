package ch15;

import java.util.Arrays;

public class ComparatorEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] strArr = {"cat","Dog","lion","tiger"};
        Arrays.sort(strArr);
        System.out.println("strArr : " + Arrays.toString(strArr));
        
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr : " + Arrays.toString(strArr));
        
        Arrays.sort(strArr, (o1,o2) -> o2.compareTo(o1));
        System.out.println("strArr : " + Arrays.toString(strArr));
        
    }
    
}
