package ch05;

import java.util.Scanner;

public class ArrayEx9
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.print("금액 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int coin[] = {500,100,50,10,5,1};
        for(int co : coin)
        {
            System.out.println(co + "동전:\t" + num / co + "개");
            num %= co;
        }


    }

}
