package ch05;

import java.util.Scanner;

public class ArrayEx3
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int num[] = new int[10];
        System.out.println("1 ~ 10 ������ ���� 10�� �Է��ϼ���");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< num.length;i++)
        {
            num[i] = sc.nextInt();
            System.out.print(num[i] + ((num[i] < 10 ) ? " : ":": "));

            for(int j =1; j<=num[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
