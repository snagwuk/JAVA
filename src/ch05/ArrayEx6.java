package ch05;

import java.util.Scanner;

public class ArrayEx6
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub


        System.out.println("2진수를 변경할 자연수를 입력하세여");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divnum = num;
        int index = 0;

        int binary[] = new int[32];
        while(divnum != 0)
        {
            binary[index++] = divnum %2;
            divnum /= 2;
        }
        System.out.print(num + "의 2진수 : ");

        for (int i = index-1; i>=0;i--)
        {
            System.out.print(binary[i]);
        }

        System.out.println();
        }
}
