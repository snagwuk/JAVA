package ch04;

import java.util.Scanner;

public class SpecialQ
{

    static int MAX = 5;
    static int arrRotation = 0;
    static int[] random = new int[MAX];
    static int[][] arr = new int[MAX][MAX];
    public static void TurnArr(int a)
    {


    }

    public static void InitArr() // arr 배열 0으로 초기화
    {
        for (int i = 0; i < MAX; i++)
        {
            for (int j = 0; j < MAX; j++)
            {
                arr[i][j] = 0;
            }
        }
    }


    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub


        boolean run = true;
        Scanner s1 = new Scanner(System.in);

        InitArr(); // arr배열 0으로 초기화

        for (int i = 0; i < MAX; i++)            // 랜덤값 random배열에 저장
        {
            random[i] = (int) ((Math.random() * MAX) + 1);
            System.out.print(random[i] + ",");
        }

        for (int j = 0; j < MAX; j++)           // random배열에 저장된 랜덤값으로 초기 그래프 생성을 위한 2차배열
        {
            int temp = random[j];
            for (int i = MAX - 1; i >= 0; i--)
            {

                if (temp != 0)
                {
                    arr[i][j] = 2;
                    temp--;
                }

            }
        }


        while (run)
        {

            System.out.println();
            for (int i = 0; i < MAX; i++) // arr 출력 for문
            {
                for (int j = 0; j < MAX; j++)
                {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.시계방향 회전 | 2.반시계방향 회전 | 3.밑으로 정렬 | 4.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택>>>");
            int num = s1.nextInt();

            switch (num)
            {
                case 1:

                    for (int i = 0; i < MAX; i++) // arr 배열 0으로 초기화 + 랜덤값 random배열에 저장
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("초기화완료");


                    for (int j = 0; j < MAX; j++)
                    {
                        int temp = random[j];
                        for (int i = 0; i < MAX; i++)
                        {

                            if (temp != 0)
                            {
                                arr[j][i] = 2;
                                temp--;
                            }
                        }
                    }
                    System.out.println("회전완료");

                    break;
                case 2:

                    for (int i = 0; i < MAX; i++) // arr 배열 0으로 초기화 + 랜덤값 random배열에 저장
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("초기화완료");

                    int randomTemp = 0;
                    for (int j = MAX-1; j >= 0; j--)
                    {
                        int temp = random[randomTemp];
                        randomTemp++;
                        for (int i = MAX-1; i >= 0; i--)
                        {

                            if (temp != 0)
                            {
                                arr[j][i] = 2;
                                temp--;
                            }
                        }
                    }
                    System.out.println("회전완료");

                    break;
                case 3:


                    int[] tempCnt = new int[MAX];
                    int cnt;

                    for (int i = 0; i < MAX; i++)
                    {
                        cnt = 0;
                        for (int j = 0; j < MAX; j++)
                        {
                            if (arr[j][i] == 2)
                                cnt++;
                        }
                        tempCnt[i] = cnt;
                    }

                    for (int i = 0; i < MAX; i++) // arr 배열 0으로 초기화 + 랜덤값 random배열에 저장
                    {
                        System.out.print(tempCnt[i] + ",");
                    }
                    System.out.println();

                    for (int i = 0; i < MAX; i++) // arr 배열 0으로 초기화 + 랜덤값 random배열에 저장
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("초기화완료");

                    for (int j = 0; j < MAX; j++)
                    {
                        int temp = tempCnt[j];
                        for (int i = MAX - 1; i >= 0; i--)
                        {

                            if (temp != 0)
                            {
                                arr[i][j] = 2;
                                temp--;
                            }

                        }
                    }


                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                case 5:         //////////////////////////////나중에 1,2,5 하나로 합치기

                    for (int i = 0; i < MAX; i++) // arr 배열 0으로 초기화 + 랜덤값 random배열에 저장
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("초기화완료");

                    int randomTemp2 = 0;
                    for (int j = MAX-1; j >= 0; j--)
                    {
                        int temp = random[randomTemp2];
                        randomTemp2++;
                        for (int i = 0; i < MAX; i++)
                        {

                            if (temp != 0)
                            {
                                arr[i][j] = 2;
                                temp--;
                            }
                        }
                    }
                    System.out.println("회전완료");
                    break;
            }

        }

        System.out.println();
        /*
         * System.out.println("┌────────────────────┐"); for(int i =0; i<MAX;
         * i++) { System.out.print("│"); for(int j = 0; j < MAX; j++) {
         * //System.out.print("　★"); } System.out.println("│"); }
         * System.out.println("└────────────────────┘");
         */

    }

}
