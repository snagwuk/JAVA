package ch04;

import java.util.Scanner;

public class Exec03
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 10���� 99������ ���� �Է¹޾� �Է¹��� �� ���� ũ�ų� �����鼭 ���� ����� 10�� ����� ���Ͽ�
        // ������ 10�� ����� �Է¹��� ���� ���� ����ϱ�
        
        System.out.println("10���� 99������ ���� �Է��ϼ���");
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
