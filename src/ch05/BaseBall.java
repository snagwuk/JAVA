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

        boolean flag = true;    // 랜덤값 생성을 정지시키는 boolean
        boolean overlap; // 기존에 있는 숫자인지 확인하는 boolean

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
                       //System.out.println(i + ":" + origin);
                   }
               }
               flag = true;
            }
        }

        //String origin = "7319";
        System.out.println("원본>>" + origin);

        Scanner sc = new Scanner(System.in);

        int strike = 0;
        int ball = 0;

        while (strike != 4)
        {
            System.out.print("입력>>");
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
            System.out.println(strike + "스트라이크," + ball + "볼");
        }
        System.out.println("정답입니다.");

    }

}
