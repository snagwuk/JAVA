package ch05;

import java.util.Scanner;

public class ArrayEx6
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub


        System.out.println("2������ ������ �ڿ����� �Է��ϼ���");
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
        System.out.print(num + "�� 2���� : ");

        for (int i = index-1; i>=0;i--)
        {
            System.out.print(binary[i]);
        }

        System.out.println();
        }
}
