package ch04;

import java.util.Scanner;

public class Exec02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // ����� ������ڿ� ������� ������ ������ ����ϱ�
        // �� ���ڿ��� ����� 10���� ���� �� �ִ�.
        
        System.out.println("����� ������ �Է��ϼ���");
        Scanner s1 = new Scanner(System.in);
        int apple = s1.nextInt();
        int box;
        
        if (apple % 10 == 0)
            box = apple / 10;
        else
            box = (apple / 10) + 1;
            
        
        System.out.println("�ʿ��� ������ ���� : " + box);
        
    }
    
}
