package ch05;

import java.util.Scanner;

public class CafeArray02
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.print("10진수 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divnum = num;
        int index = 0;

        int binary[] = new int[32];
        while (divnum != 0)
        {
            binary[index++] = divnum % 2;
            divnum /= 2;
        }
        System.out.print("2진수   : ");

        for (int i = index - 1; i >= 0; i--)
        {
            System.out.print(binary[i]);
        }

        System.out.println();

        index=0;
        divnum = num;
        int oct[] = new int[32];
        while (divnum != 0)
        {
            oct[index++] = divnum % 8;
            divnum /= 8;
        }
        System.out.print("8진수   : ");

        for (int i = index - 1; i >= 0; i--)
        {
            System.out.print(oct[i]);
        }

        System.out.println();



        System.out.println("10진수 : " + num);



        char dataS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };

        index = 0;
        int hex[] = new int[(num / 16) + 1];

        while (num > 0)
        {
            hex[index++] = num % 16;
            num /= 16;
        }

        System.out.print("16진수 : ");

        for (int i = index - 1; i >= 0; i--)
        {
            System.out.print(dataS[hex[i]]);

        }

        System.out.println();

    }

}
