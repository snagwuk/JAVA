package ch04;

import java.util.Scanner;

public class IfLoopExam04
{

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int maxint = 15;
        int[] arr = new int[maxint];    // �⺻ 0
        int result = (int)(Math.random()*16);
        boolean chk = false;

        int temp = maxint;


        Scanner sc = new Scanner(System.in);
        System.out.println("0���� " +maxint + "������ ������ 1���� �����ϼ���!!!" + result);
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

        int p1,p2;
        p1= 0;
        p2= maxint;

        while(!chk)
        {
           for(int i = p1; i<=p2/2; i++)
            {
                System.out.print(i+",");
            }
            System.out.println();

            System.out.println("��ȣ�� ������ Y(y) , �ƴϸ� N(n) �Է��ϼ���");
            String x = sc.next();

            if(x.equals("Y") || x.equals("y"))
            {
                p2 = maxint/2;


            }
            else if(x.equals("N") || x.equals("n"))
            {
                p1 = p1 + maxint/2 +1;
            }
            else
                System.out.println("Y(y) , N(n) �� �Է°����մϴ�.");

            if (p1 == p2)
                System.out.println("p1 == p2");
        }
        System.out.println("����� ��ȣ�� �Դϴ�.");



    }

}
