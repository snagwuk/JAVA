package ch05;

import java.util.Scanner;

public class ArrayEx2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int [] score = new int[10];
        System.out.println("10개의 점수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int sum=0,max=0;
        for (int i = 0; i< score.length;i++)
        {
            score[i] = sc.nextInt();
            sum+= score[i];
            if(max < score[i])
                max = score[i];
        }
        System.out.println("점수 합계 : " + sum );
        System.out.println("평균  : " + (double)sum /score.length);
        System.out.println("최대 점수 : " + max);

    }

}
