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
        int cnt[] = {5,5,5,5,5,5};

        int maxMoney = 0;
        for(int i = 0 ; i <coin.length;i++)
        {
            maxMoney+= coin[i]*cnt[i];
        }

        if(num > maxMoney)
        {
            System.out.println("동전이 부족합니다.");
            return;
        }

        for(int i = 0 ; i <coin.length;i++)
        {
            int coinNum = 0;
            coinNum = num /coin[i];
            if(cnt[i] < coinNum)
            {
                coinNum = cnt[i];
                cnt[i] = 0;
            }
            else
            {
                cnt[i] -= coinNum;
            }
            num -= coinNum * coin[i];
            System.out.println(coin[i] + "원:" + coinNum);

        }

        for(int i = 0 ; i <coin.length;i++)
        {
            System.out.println(coin[i] + "동전:\t" + cnt[i] + "개");

        }




    }

}
