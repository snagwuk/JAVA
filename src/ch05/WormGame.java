package ch05;

import java.util.Scanner;

public class WormGame
{

    final static int SIZE = 15 ;
    static int WORMLENGTH = 6;
    static String [][] board = new String[SIZE][SIZE];
    static int[][] worm = new int[WORMLENGTH][2];   // �������� ��ġ �����
    static int[] goal = new int[2];
    public static void GoalRnd()
    {
        boolean flag = true;
        int rnd0=0,rnd1=0;
        while(flag)
        {
            flag = false;
            rnd0 = (int)(Math.random()*SIZE);
            rnd1 = (int)(Math.random()*SIZE);
            for(int i = 0; i< WORMLENGTH; i++)
            {
                if(rnd0 == worm[i][0] && rnd1 == worm[i][1])
                    flag = true;
            }
        }
        goal[0] = rnd0;
        goal[1] = rnd1;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner s1 = new Scanner(System.in);
        boolean run = true;



        // board �ʱ�ȭ


        // ó�� ������ ��ġ ����


        worm[0][0] = worm[0][1] = SIZE/2;


        for(int i = 1; i< WORMLENGTH; i++)
        {
            worm[i][0] = worm[i-1][0]+1;
            worm[i][1] = worm[i-1][1];
        }

        GoalRnd();












        while (run)
        {
            for (int i = 0; i < SIZE; i++)
                for (int j = 0; j < SIZE; j++)
                {
                    if(goal[0] == i && goal[1] ==j)
                        board[i][j] = "@";
                    else
                        board[i][j] = ".";

                }


            for(int i = 0; i< WORMLENGTH; i++)
            {
                if (i ==0)
                    board[worm[i][0]][worm[i][1]] = "X";
                else
                    board[worm[i][0]][worm[i][1]] = "0";
            }


           /* System.out.printf("%2s","��");
            for (int j = 0; j < SIZE-2; j++)
                System.out.printf("%2s","����");
            System.out.printf("%2s\n","��");*/


            for (int i = 0; i < SIZE; i++)
            {
                //System.out.printf("%s","��");
                for (int j = 0; j < SIZE; j++)
                {
                    System.out.printf("%2s",board[i][j]);
                }
                //System.out.printf("%s\n","��");
                System.out.println();
            }
            /*System.out.printf("%2s","��");
            for (int j = 0; j < SIZE; j++)
                System.out.printf("%2s","����");
            System.out.printf("%2s\n","��");*/

            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.println("A. ���� | S.�Ʒ��� | D.������ | W.���� | Q.����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.print("����>>>");
            String num = s1.next();
            switch(num)
            {
                case "W":
                case "w":

                    for(int i = WORMLENGTH-1; i> 0; i--)
                    {
                        worm[i][0] = worm[i-1][0];
                        worm[i][1] = worm[i-1][1];
                    }
                    if(--worm[0][0] < 0)
                    {
                        run = false;
                        System.out.println("�����̰� ���� �浹!!!");
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("0"))
                    {
                        System.out.println("�ڱ� �ڽ� �Ծ���� ><");
                        run = false;
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("@"))
                    {
                        System.out.println("�Ա� ���� !!!!");
                        GoalRnd();
                    }
                    break;

                case "S":
                case "s":
                    for(int i = WORMLENGTH-1; i> 0; i--)
                    {
                        worm[i][0] = worm[i-1][0];
                        worm[i][1] = worm[i-1][1];
                    }

                    if(++worm[0][0] >= SIZE)
                    {
                        run = false;
                        System.out.println("�����̰� ���� �浹!!!");
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("0"))
                    {
                        System.out.println("�ڱ� �ڽ� �Ծ���� ><");
                        run = false;
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("@"))
                    {
                        System.out.println("�Ա� ���� !!!!");
                        GoalRnd();
                    }

                    break;

                case "A":
                case "a":
                    for(int i = WORMLENGTH-1; i> 0; i--)
                    {
                        worm[i][0] = worm[i-1][0];
                        worm[i][1] = worm[i-1][1];
                    }
                    if(--worm[0][1] < 0)
                    {
                        run = false;
                        System.out.println("�����̰� ���� �浹!!!");
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("0"))
                    {
                        System.out.println("�ڱ� �ڽ� �Ծ���� ><");
                        run = false;
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("@"))
                    {
                        System.out.println("�Ա� ���� !!!!");
                        GoalRnd();
                    }
                    break;

                case "D":
                case "d":
                    for(int i = WORMLENGTH-1; i> 0; i--)
                    {
                        worm[i][0] = worm[i-1][0];
                        worm[i][1] = worm[i-1][1];
                    }
                    if(++worm[0][1] >= SIZE)
                    {
                        run = false;
                        System.out.println("�����̰� ���� �浹!!!");
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("0"))
                    {
                        System.out.println("�ڱ� �ڽ� �Ծ���� ><");
                        run = false;
                        break;
                    }
                    if(board[worm[0][0]][worm[0][1]].equals("@"))
                    {
                        System.out.println("�Ա� ���� !!!!");
                        GoalRnd();
                    }

                    break;

                case "Q":
                case "q":
                    run = false;
                    break;
                default:
                    System.out.println("�߸��� �����Դϴ�. !!!!");
                    break;
            }


    }

    }
}
