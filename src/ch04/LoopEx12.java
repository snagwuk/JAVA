package ch04;

import java.util.Scanner;

public class LoopEx12
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("���ڵ��� �Է��ϼ���");
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        char ch;
        boolean isNum = true;
        for (int i = 0; i < value.length();i++)
        {
            ch = value.charAt(i);
            if( ch < '0' || ch > '9')
            {
                isNum = false;
                break;
            }
        }

        int sum = 0;
        if(isNum)
        {
            for(int i=0;i<value.length();i++)
            {
                ch = value.charAt(i);
                sum+= ch -'0';

            }
            System.out.println("�ڸ����հ� : " + sum);
        }
        else
        {
            System.out.println("���ھƴ�");
        }
    }

}
