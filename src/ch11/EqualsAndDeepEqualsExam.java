package ch11;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, null));
        System.out.println(Objects.equals(null, o2));
        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.deepEquals(o1, o2) + "\n");
        
        Integer[] ar1 = {1,2};
        Integer[] ar2 =  {1,2};
        System.out.println(Objects.equals(ar1, ar2));
        System.out.println(Objects.deepEquals(ar1, ar2));
        System.out.println(Arrays.deepEquals(ar1, ar2));
        System.out.println(Objects.deepEquals(null, ar2));
        System.out.println(Objects.deepEquals(ar1, null));
        System.out.println(Objects.deepEquals(null, null));
        
    }
    
}
