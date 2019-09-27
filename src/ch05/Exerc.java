package ch05;

import java.util.Scanner;

public class Exerc
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("7번문제");
        int maxx = 0;
        int[] arr = {1,5,3,8,2};
        for(int x : arr)
        {
            if(maxx < x)
                maxx = x;
        }
        System.out.println("max = " + maxx);

        System.out.println("8번문제");
        //8번문제
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        int sum = 0;
        double avg = 0.0;
        int leng = 0;

        for (int[] x : array)
        {
            for (int y : x)
            {
                sum += y;
                leng++;
            }
        }
        avg = (double)sum / leng;

        System.out.println("sum : "+ sum );
        System.out.println("avg : "+ avg );

        System.out.println("9번문제");
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);
        while(run)
        {
            System.out.println();
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>>>");
            int selectNo = sc.nextInt();

            if(selectNo == 1)
            {
                System.out.print("학생수>>>");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            }
            else if(selectNo == 2)
            {
                for(int i = 0; i < scores.length; i++)
                {
                    System.out.print("scores[" + i + "]: ");
                    scores[i] = sc.nextInt();
                }
            }
            else if(selectNo == 3)
            {
                for(int i = 0; i < scores.length; i++)
                {
                    System.out.println("scores[" + i + "]: "+ scores[i]);
                }

            }
            else if(selectNo == 4)
            {
                int max=0;
                double avgs=0.0;
                for(int x : scores)
                {
                    avgs += x;
                    if (max < x)
                        max = x;
                }
                avgs /= scores.length;

                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + avgs);
            }
            else if(selectNo == 5)
            {
                run = false;
            }
        }
        System.out.println("프로그램종료");


    }

}
