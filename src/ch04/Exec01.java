package ch04;

import java.util.Scanner;

public class Exec01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 문자를 입력받아서 소문자인 경우 대문자로 변경하여 출력하기
        // 영문자 아닌 경우 소문자 아님 출력하기!!!!
        
       
        
        
        System.out.println("소문자를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        char c = s1.next().charAt(0);
        
        if ( c>= 'a' && c <= 'z')
        {
            c -= 32;
            System.out.println("출력 : " + c);
        }
        else if (c>= 'A' && c <= 'Z')
        {
            System.out.println("출력 : " + c);
        }
        else
        {
            System.out.println("소문자 아님 !!!");
        }
       
        
    }
    
}
