package ch04;

import java.util.Scanner;

public class LoopEx12
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("숫자들을 입력하세요");
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
            System.out.println("자리수합계 : " + sum);
        }
        else
        {
            System.out.println("숫자아님");
        }
    }

}
