package ch05;

public class ArrayCreate
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        final int SIZE = 11;
        int[] origin = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[SIZE];

        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * origin.length);
            int t = (int) (Math.random() * origin.length);
            int tmp = origin[f];
            origin[f] = origin[t];
            origin[t] = tmp;
        }

        for(int x : origin)
            System.out.print(x + ",");
        System.out.println();

        int j = 0;

        for (int i = 0; i < result.length; i++)
        {
            result[i] = origin[j];
            if(i %2 == 1)
                j++;
        }

        for(int x : result)
            System.out.print(x + ",");
        System.out.println();

        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * result.length);
            int t = (int) (Math.random() * result.length);
            int tmp = result[f];
            result[f] = result[t];
            result[t] = tmp;
        }

        for(int x : result)
            System.out.print(x + ",");
        System.out.println();

/*

        char[] arr = new char[9];
        String origin = "";
        boolean flag = true;    // 랜덤값 생성을 정지시키는 boolean
        boolean overlap; // 기존에 있는 숫자인지 확인하는 boolean
        for(int i = 0 ; i < SIZE; i++)
        {
            if (i == 0)
                origin = Integer.toString((int)((Math.random() * 10)))  + origin;
            else
            {
               while(flag)
               {
                   overlap = true;
                   String tmp = Integer.toString((int)((Math.random() * 10)));

                   for(int j = 0; j < origin.length() ; j++)
                   {
                       if(origin.charAt(j) == tmp.charAt(0))    //이미 존재하는 숫자이므로 for문 종료 후 다시 while문
                       {
                           overlap = false;
                           break;
                       }
                   }
                   if(overlap)                                  // 중복되지 않으므로 해당 숫자 String에 더함
                   {
                       flag = false;
                       origin = origin + tmp;
                   }
               }
               flag = true;
            }
        }


        System.out.println(origin);
        int j = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(i %2 == 1)
                j++;
            arr[i] = origin.charAt(j);


        }
        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * 9);
            int t = (int) (Math.random() * 9);

            char tmp = arr[f];
            arr[f] = arr[t];
            arr[t] = tmp;
        }
        for(char x : arr)
            System.out.print(x + ",");
*/

    }

}
