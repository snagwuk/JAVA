package ch04;

import java.util.Scanner;

public class CheckExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        System.out.println("4������");
        while(true)
        {
            int d1 = (int)(Math.random()*5)+1;
            int d2 = (int)(Math.random()*5)+1;
            System.out.println("("+d1+","+d2+")");
            if (d1+d2 == 5)
                break;

        }

        System.out.println("5������");
        for(int x = 1; x <= 10; x++)
        {
            for(int y = 1; y <=10; y++)
            {
                if ( (4 * x + 5 * y) == 60 )
                {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("6������");
        for (int i = 1; i<=5;i++)
        {
            for(int j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("7������");

        boolean run = true;
        int balance = 0;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        while(run)
        {
            System.out.println("�ѤѤѤѤѤѤѤѤѤ�");
            System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤ�");
            System.out.print("����>>>");

            int num = s1.nextInt();
            switch(num)
            {
                case 1:
                    System.out.print("���ݾ�>");
                    int temp = s2.nextInt();
                    balance += temp;
                    System.out.println();
                    break;
                case 2:
                    System.out.print("��ݾ�>");
                    int temp2 = s2.nextInt();
                    balance -= temp2;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("�ܰ�>" + balance);
                    break;
                case 4:
                    run = false;

                    System.out.println("���α׷� ����");
                    break;
            }





        }

    }

}
