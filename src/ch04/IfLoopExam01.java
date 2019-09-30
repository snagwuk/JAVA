package ch04;

import java.util.Scanner;

public class IfLoopExam01
{

    public static void main(String[] args)
    {
        // 1번문제
        System.out.println("강아지와 병아리의 합계를 입력하세요>>");
        Scanner s1 = new Scanner(System.in);
        int acnt = s1.nextInt();
        System.out.println("강아지와 병아리의 다리의 합계를 입력하세요>>");
        int lcnt = s1.nextInt();

        boolean chk = false;

        for(int x=1; x<=acnt; x++)
        {
            for(int y=1; y<=acnt; y++)
            {
                if (((x * 4) + (2 * y)) == lcnt && (x+y) == acnt)
                {
                    System.out.println("강아지는 "+x+"마리이고,병아리는" + y +"마리입니다.");
                    chk = true;

                }
            }
        }
        if (chk == false)
            System.out.println("정답없음");






    }

}
