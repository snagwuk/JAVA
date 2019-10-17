package ch09_OOP;


public class Exam08
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{}));
    }

    @SuppressWarnings("unused")
    private static String max(int[] data)
    {
        // TODO Auto-generated method stub
        if(data==null)
            return "data배열이 null 입니다.";
        if(data.length ==0)
            return "배열의 크기가 0입니다.";
        
        
        int max = data[0];
        for(int x : data)
        {
            if(x > max)
                max = x;
        }
        return max+"";
    }
    
}
