package ch09_OOP;


public class Exam08
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("�ִ밪 : " + max(data));
        System.out.println("�ִ밪 : " + max(null));
        System.out.println("�ִ밪 : " + max(new int[]{}));
    }

    @SuppressWarnings("unused")
    private static String max(int[] data)
    {
        // TODO Auto-generated method stub
        if(data==null)
            return "data�迭�� null �Դϴ�.";
        if(data.length ==0)
            return "�迭�� ũ�Ⱑ 0�Դϴ�.";
        
        
        int max = data[0];
        for(int x : data)
        {
            if(x > max)
                max = x;
        }
        return max+"";
    }
    
}
