package ch04;

import java.util.Scanner;

public class IfLoopExam01
{

    public static void main(String[] args)
    {
        // 1������
        System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���>>");
        Scanner s1 = new Scanner(System.in);
        int acnt = s1.nextInt();
        System.out.println("�������� ���Ƹ��� �ٸ��� �հ踦 �Է��ϼ���>>");
        int lcnt = s1.nextInt();

        boolean chk = false;

        for(int x=1; x<=acnt; x++)
        {
            for(int y=1; y<=acnt; y++)
            {
                if (((x * 4) + (2 * y)) == lcnt && (x+y) == acnt)
                {
                    System.out.println("�������� "+x+"�����̰�,���Ƹ���" + y +"�����Դϴ�.");
                    chk = true;

                }
            }
        }
        if (chk == false)
            System.out.println("�������");






    }

}
