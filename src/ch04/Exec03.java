package ch04;

import java.util.Scanner;

public class Exec03
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 10부터 99사이의 수를 입력받아 입력받은 수 보다 크거나 같으면서 가장 가까운 10의 배수를 구하여
        // 구해진 10의 배수와 입력받은 수의 차를 출력하기
        
        System.out.println("10부터 99사이의 수를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int ten;
        
        if (num % 10 == 0)
            ten = num / 10 * 10;
        else
            ten = ((num / 10) + 1)*10;
       
   
        System.out.println(ten + " - " + num + " = " + (ten-num));
        
    }
    
}
