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

    public static void InitArr() // arr �迭 0���� �ʱ�ȭ
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

        InitArr(); // arr�迭 0���� �ʱ�ȭ

        for (int i = 0; i < MAX; i++)            // ������ random�迭�� ����
        {
            random[i] = (int) ((Math.random() * MAX) + 1);
            System.out.print(random[i] + ",");
        }

        for (int j = 0; j < MAX; j++)           // random�迭�� ����� ���������� �ʱ� �׷��� ������ ���� 2���迭
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
            for (int i = 0; i < MAX; i++) // arr ��� for��
            {
                for (int j = 0; j < MAX; j++)
                {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }

            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.println("1.�ð���� ȸ�� | 2.�ݽð���� ȸ�� | 3.������ ���� | 4.����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.print("����>>>");
            int num = s1.nextInt();

            switch (num)
            {
                case 1:

                    for (int i = 0; i < MAX; i++) // arr �迭 0���� �ʱ�ȭ + ������ random�迭�� ����
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("�ʱ�ȭ�Ϸ�");


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
                    System.out.println("ȸ���Ϸ�");

                    break;
                case 2:

                    for (int i = 0; i < MAX; i++) // arr �迭 0���� �ʱ�ȭ + ������ random�迭�� ����
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("�ʱ�ȭ�Ϸ�");

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
                    System.out.println("ȸ���Ϸ�");

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

                    for (int i = 0; i < MAX; i++) // arr �迭 0���� �ʱ�ȭ + ������ random�迭�� ����
                    {
                        System.out.print(tempCnt[i] + ",");
                    }
                    System.out.println();

                    for (int i = 0; i < MAX; i++) // arr �迭 0���� �ʱ�ȭ + ������ random�迭�� ����
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("�ʱ�ȭ�Ϸ�");

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
                    System.out.println("���α׷� ����");
                    break;
                case 5:         //////////////////////////////���߿� 1,2,5 �ϳ��� ��ġ��

                    for (int i = 0; i < MAX; i++) // arr �迭 0���� �ʱ�ȭ + ������ random�迭�� ����
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }
                    System.out.println("�ʱ�ȭ�Ϸ�");

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
                    System.out.println("ȸ���Ϸ�");
                    break;
            }

        }

        System.out.println();
        /*
         * System.out.println("��������������������������������������������"); for(int i =0; i<MAX;
         * i++) { System.out.print("��"); for(int j = 0; j < MAX; j++) {
         * //System.out.print("����"); } System.out.println("��"); }
         * System.out.println("��������������������������������������������");
         */

    }

}
