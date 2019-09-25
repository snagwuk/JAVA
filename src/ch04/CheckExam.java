package ch04;

import java.util.Scanner;

public class CheckExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        System.out.println("4번문제");
        while(true)
        {
            int d1 = (int)(Math.random()*5)+1;
            int d2 = (int)(Math.random()*5)+1;
            System.out.println("("+d1+","+d2+")");
            if (d1+d2 == 5)
                break;

        }

        System.out.println("5번문제");
        for(int x = 1; x <= 10; x++)
        {
            for(int y = 1; y <=10; y++)
            {
                if ( (4 * x + 5 * y) == 60 )
                {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("6번문제");
        for (int i = 1; i<=5;i++)
        {
            for(int j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("7번문제");

        boolean run = true;
        int balance = 0;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        while(run)
        {
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>>>");

            int num = s1.nextInt();
            switch(num)
            {
                case 1:
                    System.out.print("예금액>");
                    int temp = s2.nextInt();
                    balance += temp;
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    int temp2 = s2.nextInt();
                    balance -= temp2;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    break;
                case 4:
                    run = false;

                    System.out.println("프로그램 종료");
                    break;
            }





        }

    }

}
