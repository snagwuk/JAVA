package ch04;

import java.util.Scanner;

public class Exec02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 사과를 사과상자에 담기위한 상자의 갯수를 출력하기
        // 한 상자에는 사과를 10개씩 담을 수 있다.
        
        System.out.println("사과의 갯수를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        int apple = s1.nextInt();
        int box;
        
        if (apple % 10 == 0)
            box = apple / 10;
        else
            box = (apple / 10) + 1;
            
        
        System.out.println("필요한 상자의 갯수 : " + box);
        
    }
    
}
