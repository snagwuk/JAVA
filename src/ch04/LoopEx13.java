package ch04;

import java.util.Scanner;

public class LoopEx13
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("���ڸ� �Է��ϼ���");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0)
        {
            sum += num%10;
            num /= 10;
        }
        System.out.println("�ڸ����հ� : " + sum);

    }

}
