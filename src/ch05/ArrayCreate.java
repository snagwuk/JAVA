package ch05;

public class ArrayCreate
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        final int SIZE = 5;
        char[] arr = new char[9];
        String origin = "";

        boolean flag = true;    // ������ ������ ������Ű�� boolean
        boolean overlap; // ������ �ִ� �������� Ȯ���ϴ� boolean

        for(int i = 0 ; i < SIZE; i++)
        {
            if (i == 0)
            {
                origin = Integer.toString((int)((Math.random() * 10)))  + origin;
            }
                 //i=1,2,3
            else
            {
               while(flag)
               {
                   overlap = true;
                   String tmp = Integer.toString((int)((Math.random() * 10)));

                   for(int j = 0; j < origin.length() ; j++)
                   {
                       if(origin.charAt(j) == tmp.charAt(0))    //�̹� �����ϴ� �����̹Ƿ� for�� ���� �� �ٽ� while��
                       {
                           overlap = false;
                           break;
                       }
                   }
                   if(overlap)                                  // �ߺ����� �����Ƿ� �ش� ���� String�� ����
                   {
                       flag = false;
                       origin = origin + tmp;
                       //
                   }
               }
               flag = true;
            }
        }

        System.out.println( origin);
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

    }

}
