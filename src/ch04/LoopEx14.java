package ch04;

import java.util.Scanner;

public class LoopEx14
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int sum=0 ,cnt=0;

        while (true)
        {
            System.out.println("숫잘ㄹ입력하세요(종료:99999)");
            int num = sc.nextInt();
            if(num == 99999) break;
            sum += num;
            cnt++;

        }
        System.out.println("총합 : " + sum + "평균 : " + (double)sum/cnt);

    }

}
