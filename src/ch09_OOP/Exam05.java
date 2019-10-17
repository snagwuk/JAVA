package ch09_OOP;

public class Exam05
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    private static int[] shuffle(int[] original)
    {
        int[] result = original;
        
        for(int i =0; i < result.length; i++)
        {
            int r = (int) (Math.random()*result.length);
            int tmp = result[i];
            result[i] = result[r];
            result[r] = tmp;            
        }
        
        return result;
    }
    
}
