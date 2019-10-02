package ch05;

import java.util.Scanner;

public class BaseBall
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        final int SIZE = 4;
        String result = "";

        int[] origin = new int[10];
        for (int i = 0; i < origin.length; i++)
            origin[i] = i;

        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * origin.length);
            int t = (int) (Math.random() * origin.length);
            int tmp = origin[f];
            origin[f] = origin[t];
            origin[t] = tmp;
        }

        for (int i = 0; i < 4; i++)
            result += origin[i];




       /* boolean flag = true;    // ������ ������ ������Ű�� boolean
        boolean overlap; // ������ �ִ� �������� Ȯ���ϴ� boolean

        for(int i = 0 ; i < SIZE; i++)
        {
            if (i == 0)
            {
                origin = Integer.toString((int)((Math.random() * 10)))  + origin;
            }
            else         //i=1,2,3
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
                       //System.out.println(i + ":" + origin);
                   }
               }
               flag = true;
            }
        }*/


        System.out.println("����>>" + result);
        Scanner sc = new Scanner(System.in);
        int strike = 0;
        int ball = 0;

        while (strike != 4)
        {
            System.out.print("�Է�>>");
            String num = sc.next();
            strike = 0;
            ball = 0;
            for (int i = 0; i < SIZE; i++)
            {
                if (result.charAt(i) == num.charAt(i))
                    strike++;
                for (int j = 0; j < SIZE; j++)
                {
                    if (i != j && result.charAt(i) == num.charAt(j))
                        ball++;
                }
            }
            System.out.println(strike + "strike, " + ball + "ball");
        }
        System.out.println("�����Դϴ�.");

    }

}
