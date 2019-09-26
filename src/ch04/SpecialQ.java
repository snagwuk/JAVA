package ch04;

import java.util.Scanner;

public class SpecialQ
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        final int MAX = 10;
        final int CHAR = 2;
        int[] random = new int[MAX];
        int[][] arr = new int[MAX][MAX];

        boolean run = true;
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < MAX; i++) // arr배열 0으로 초기화
        {
            for (int j = 0; j < MAX; j++)
            {
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < MAX; i++) // 각각의 랜덤값들을 random배열에 저장
        {
            random[i] = (int) ((Math.random() * MAX) + 1);
            if (i == MAX - 1)
                System.out.println(random[i]);
            else
                System.out.print(random[i] + ",");
        }

        for (int i = 0; i <= 2 * MAX + 1; i++) // 구분선
        {
            System.out.print("─");
        }
        System.out.println();

        for (int j = 0; j < MAX; j++) // random배열에 저장된 랜덤값으로 초기 arr배열 생성
        {
            int temp = random[j];
            for (int i = MAX - 1; i >= 0; i--)
            {
                if (temp != 0)
                {
                    arr[i][j] = CHAR;
                    temp--;
                }
            }
        }

        while (run)
        {
            /// arr 2차배열 테두리포함한 출력 for문들
            System.out.print("┌");
            for (int i = 0; i <= 2 * MAX; i++)
            {
                System.out.print("─");
            }
            System.out.println("┐");

            for (int i = 0; i < MAX; i++)
            {
                System.out.print("│ ");
                for (int j = 0; j < MAX; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("│");
            }
            System.out.print("└");
            for (int i = 0; i <= 2 * MAX; i++)
            {
                System.out.print("─");
            }
            System.out.println("┘");

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.시계방향 회전 | 2.반시계방향 회전 | 3.밑으로 정렬 | 4.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>>>");
            int num = s1.nextInt();

            switch (num)
            {
                case 1: // 시계방향 회전

                    int[][] temp = new int[MAX][MAX];

                    for (int i = 0; i < MAX; i++)
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            temp[j][MAX - 1 - i] = arr[i][j];

                        }
                    }
                    arr = temp;
                    break;
                case 2: // 반시계방향 회전

                    int[][] temp2 = new int[MAX][MAX];

                    for (int i = 0; i < MAX; i++)
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            temp2[MAX - j - 1][i] = arr[i][j];

                        }
                    }
                    arr = temp2;
                    break;
                case 3: // 밑으로 정렬

                    int[] tempCnt = new int[MAX];
                    int cnt;

                    for (int i = 0; i < MAX; i++) // 각 열의 갯수들을 구하여 tempCnt배열에 저장
                    {
                        cnt = 0;
                        for (int j = 0; j < MAX; j++)
                        {
                            if (arr[j][i] == CHAR) cnt++;
                        }
                        tempCnt[i] = cnt;
                    }

                    /*for (int i = 0; i < MAX; i++)
                    {
                        System.out.print(tempCnt[i] + ",");
                    }
                    System.out.println();*/

                    for (int i = 0; i < MAX; i++) // arr 배열 초기화
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }

                    for (int j = 0; j < MAX; j++) // 각 열의 갯수들을 저장한 tempCnt배열
                                                  // 이용하여 정렬된 arr2차배열 생성
                    {
                        int temp3 = tempCnt[j];
                        for (int i = MAX - 1; i >= 0; i--)
                        {
                            if (temp3 != 0)
                            {
                                arr[i][j] = CHAR;
                                temp3--;
                            }
                        }
                    }
                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }

}
