package Test;

public class Test
{
          int original[];

          static int[] shuffle(  int[] original){//ī���� ������ ���´�.
             for(int i=0;i<original.length;i++)
             {
                int r = (int)(Math.random()*original.length);
                int temp = original[i];
                original[i] = original[r];
                original[r]=temp;
                }
             return original;
             }
          
       

       public static void main(String[] args) {
          int[] original = {1,2,3,4,5,6,7,8,9};
          System.out.println(java.util.Arrays.toString(original));
          
          int[]result = shuffle(original);
          System.out.println(java.util.Arrays.toString(result));

       }

    }