package ch04;

import java.util.Scanner;

public class LoopEx13
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0)
        {
            sum += num%10;
            num /= 10;
        }
        System.out.println("자리수합계 : " + sum);

    }

}
