package ch05;

import java.util.Scanner;

public class ArrayEx2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int [] score = new int[10];
        System.out.println("10���� ������ �Է��ϼ���");
        Scanner sc = new Scanner(System.in);
        int sum=0,max=0;
        for (int i = 0; i< score.length;i++)
        {
            score[i] = sc.nextInt();
            sum+= score[i];
            if(max < score[i])
                max = score[i];
        }
        System.out.println("���� �հ� : " + sum );
        System.out.println("���  : " + (double)sum /score.length);
        System.out.println("�ִ� ���� : " + max);

    }

}
