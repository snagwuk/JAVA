package ch04;

import java.util.Scanner;

public class ForExec01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 랜덤한 홀수를 입력받아 모래시계로 프린트
        
       /* System.out.println("랜덤한 홀수를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("입력수 : " + n);*/
        
        int n = ((int)(Math.random()*11)+5)*2+1;
        System.out.println("입력수 : " + n);
        
        int i=0,j=0,z=0;
        
        for ( z = 1; z <= n; z++)
        {
            if (z <= (n/2+1) )
            {
                for( i = z-1 ; i > 0 ; i--)
                {
                    System.out.print(" ");
                }
                for( j = n - 2*(z-1) ; j >= 1 ; j--)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for( i = n-z ; i > 0 ; i--)
                {
                    System.out.print(" ");
                }
                for( j = 1; j <= n-2*(n-z) ; j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }   
    }
    
}
