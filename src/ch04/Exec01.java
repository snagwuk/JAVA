package ch04;

import java.util.Scanner;

public class Exec01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // ���ڸ� �Է¹޾Ƽ� �ҹ����� ��� �빮�ڷ� �����Ͽ� ����ϱ�
        // ������ �ƴ� ��� �ҹ��� �ƴ� ����ϱ�!!!!
        
       
        
        
        System.out.println("�ҹ��ڸ� �Է��ϼ���");
        Scanner s1 = new Scanner(System.in);
        char c = s1.next().charAt(0);
        
        if ( c>= 'a' && c <= 'z')
        {
            c -= 32;
            System.out.println("��� : " + c);
        }
        else if (c>= 'A' && c <= 'Z')
        {
            System.out.println("��� : " + c);
        }
        else
        {
            System.out.println("�ҹ��� �ƴ� !!!");
        }
       
        
    }
    
}
