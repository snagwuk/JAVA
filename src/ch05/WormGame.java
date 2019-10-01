package ch05;

import java.util.Scanner;

public class WormGame
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        final int SIZE = 15 ;
        Scanner s1 = new Scanner(System.in);
        boolean run =true;
        String [][] board = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = "　";

        int pi,pj;
        pi = pj = SIZE/2;


        int [] head = {SIZE/2,SIZE/2};

        while (run)
        {
            board[pi][pj] = "X";
            System.out.printf("%2s","┌─");
            for (int j = 0; j < SIZE+5; j++)
                System.out.printf("%2s","──");
            System.out.printf("%2s\n","─┐");
            for (int i = 0; i < SIZE; i++)
            {
                //System.out.printf("%s","│");
                for (int j = 0; j < SIZE; j++)
                {
                    System.out.printf("%2s",board[i][j]);
                }
                //System.out.printf("%s\n","│");
                System.out.println();
            }
            System.out.printf("%2s","└─");
            for (int j = 0; j < SIZE+5; j++)
                System.out.printf("%2s","──");
            System.out.printf("%2s\n","─┘");

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("A. 왼쪽 | S.아래쪽 | D.오른쪽 | W.위쪽 | Q.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>>>");
            String num = s1.next();
            switch(num)
            {
                case "A":
                case "a":
                    board[pi][pj] = "　";
                    pj--;
                    break;
                case "S":
                case "s":
                    board[pi][pj] = "　";
                    pi++;
                    break;
                case "D":
                case "d":
                    board[pi][pj] = "　";
                    pj++;
                    break;
                case "W":
                case "w":
                    board[pi][pj] = "　";
                    pi--;
                    break;
                case "Q":
                case "q":
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. !!!!");
                    break;
            }


    }

    }
}
