package ch05;

import java.util.Scanner;

public class BaseBall
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        final int SIZE = 4;
        String origin = "";

        boolean flag = true;    // ������ ������ ������Ű�� boolean
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
        }

        //String origin = "7319";
        System.out.println("����>>" + origin);

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
                if (origin.charAt(i) == num.charAt(i))
                    strike++;
                for (int j = 0; j < SIZE; j++)
                {
                    if (i != j && origin.charAt(i) == num.charAt(j))
                        ball++;
                }
            }
            System.out.println(strike + "��Ʈ����ũ," + ball + "��");
        }
        System.out.println("�����Դϴ�.");

    }

}
