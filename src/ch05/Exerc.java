package ch05;

import java.util.Scanner;

public class Exerc
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("7������");
        int maxx = 0;
        int[] arr = {1,5,3,8,2};
        for(int x : arr)
        {
            if(maxx < x)
                maxx = x;
        }
        System.out.println("max = " + maxx);

        System.out.println("8������");
        //8������
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

        System.out.println("9������");
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);
        while(run)
        {
            System.out.println();
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5. ����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.print("����>>>");
            int selectNo = sc.nextInt();

            if(selectNo == 1)
            {
                System.out.print("�л���>>>");
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

                System.out.println("�ְ� ���� : " + max);
                System.out.println("��� ���� : " + avgs);
            }
            else if(selectNo == 5)
            {
                run = false;
            }
        }
        System.out.println("���α׷�����");


    }

}
