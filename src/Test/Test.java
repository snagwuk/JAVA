package Test;

import java.util.Vector;

public class Test
{
    int original[];
    
    static int[] shuffle(int[] original)
    {// ī���� ������ ���´�.
        for (int i = 0; i < original.length; i++)
        {
            int r = (int) (Math.random() * original.length);
            int temp = original[i];
            original[i] = original[r];
            original[r] = temp;
        }
        return original;
    }
    
    public static void main(String[] args)
    {
       
        String s = "��1 2 3 4 5 7 8 9 "; 
        System.out.println(s.substring(1));
        System.out.println(s.substring(0,1));
    }
    
}

class goods
{
    
}