package ch04;

import java.util.Scanner;

public class searchNumber
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        int maxint = 15;
        Scanner scan = new Scanner(System.in);
        System.out.println("0���� " +maxint + "������ ������ 1���� �����ϼ���!!!");
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        String maxbit = Integer.toBinaryString(maxint);
        String temp = "";
        String input = "";
        int searchnum = 0;

        for (int index = 0 ; index < maxbit.length(); index++)
        {
            for (int i = 0 ; i <= maxint; i++)
            {
                temp = "0000" + Integer.toBinaryString(i);
                temp = temp.substring(temp.length()-4);
                if(temp.charAt(index) == '1')
                {
                    System.out.print(i+",");
                }

            }
            System.out.println();
            System.out.println("��ȣ�� ������ Y(y) , �ƴϸ� N(n) �Է��ϼ���");
            input = scan.next();

            if(input.equals("y")|| input.equals("Y"))
            {
                searchnum+=(int)Math.pow(2, (maxbit.length()-1-index));
            }
        }
        System.out.println("����� ��ȣ�� " + searchnum + "�Դϴ�");
    }
}
