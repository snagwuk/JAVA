package ch04;

import java.util.Scanner;

public class ForExec02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
       /* System.out.println("랜덤한 홀수를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("입력수 : " + n);*/
        
        int n = ((int)(Math.random()*11)+5)*2+1;
        System.out.println("입력수 : " + n);
        
        for (int z = 1; z <= n; z++)
        {
            if (z <= n / 2 + 1)
            {
                for (int i = 1; i <= (n / 2 + 1) - z; i++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < (2*(z-1))-1 ;j++)
                {
                    System.out.print(" ");
                }
                
            }
            else
            {
                for (int i = 1; i <= z - (n / 2 + 1); i++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2*(n-z)-1 ;j++)
                {
                    System.out.print(" ");
                }
            }
            
            
           
            if(z != n && z != 1)
                System.out.print("*");
            
            System.out.println();
        }
        
    }
    
}
