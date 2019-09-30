package ch05;

import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.print("ют╥б :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        boolean result = false;
        int sum = 0;

        while(n != 0)
        {
            sum += n%10;
            n /= 10;
        }
        if( num % sum == 0)
            result = true;
        else
            result = false;

        System.out.println(result);








    }

}
