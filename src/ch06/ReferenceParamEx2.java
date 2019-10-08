package ch06;

public class ReferenceParamEx2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int [] arr = new int[] {6,2,1,3,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println(sum(arr));
    }

    static void sortArr(int[] arr)
    {
        // TODO Auto-generated method stub

        for (int i = 0 ;i < arr.length-1; i++)
        {
           for(int j = i+1 ; j <arr.length-1-i;j++)
           {
               if(arr[i] > arr[j])
               {
                   int tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
           }
        }


    }

    static int sum(int[] arr)
    {
        // TODO Auto-generated method stub
        int sum  = 0;
        for(int x : arr)
            sum+=x;
        return sum;
    }

    static void printArr(int[] arr)
    {
        // TODO Auto-generated method stub
        for(int x : arr)
            System.out.print(x + ",");
        System.out.println();

    }

}
