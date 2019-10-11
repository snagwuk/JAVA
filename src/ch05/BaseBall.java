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
        System.out.println("원본>>" + result);


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
        System.out.println("정답입니다.");

    }

}
