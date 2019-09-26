package ch04;

import java.util.Scanner;

public class IfLoopExam04
{

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int maxint = 15;
        int[] arr = new int[maxint];    // 기본 0
        int result = (int)(Math.random()*16);
        boolean chk = false;

        int temp = maxint;


        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 " +maxint + "까지의 숫자중 1개를 생각하세요!!!" + result);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        int p1,p2;
        p1= 0;
        p2= maxint;

        while(!chk)
        {
           for(int i = p1; i<=p2/2; i++)
            {
                System.out.print(i+",");
            }
            System.out.println();

            System.out.println("번호가 있으면 Y(y) , 아니면 N(n) 입력하세요");
            String x = sc.next();

            if(x.equals("Y") || x.equals("y"))
            {
                p2 = maxint/2;


            }
            else if(x.equals("N") || x.equals("n"))
            {
                p1 = p1 + maxint/2 +1;
            }
            else
                System.out.println("Y(y) , N(n) 만 입력가능합니다.");

            if (p1 == p2)
                System.out.println("p1 == p2");
        }
        System.out.println("당신의 번호는 입니다.");



    }

}
