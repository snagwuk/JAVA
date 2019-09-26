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

        for (int i = 0; i < MAX; i++) // arr�迭 0���� �ʱ�ȭ
        {
            for (int j = 0; j < MAX; j++)
            {
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < MAX; i++) // ������ ���������� random�迭�� ����
        {
            random[i] = (int) ((Math.random() * MAX) + 1);
            if (i == MAX - 1)
                System.out.println(random[i]);
            else
                System.out.print(random[i] + ",");
        }

        for (int i = 0; i <= 2 * MAX + 1; i++) // ���м�
        {
            System.out.print("��");
        }
        System.out.println();

        for (int j = 0; j < MAX; j++) // random�迭�� ����� ���������� �ʱ� arr�迭 ����
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
            /// arr 2���迭 �׵θ������� ��� for����
            System.out.print("��");
            for (int i = 0; i <= 2 * MAX; i++)
            {
                System.out.print("��");
            }
            System.out.println("��");

            for (int i = 0; i < MAX; i++)
            {
                System.out.print("�� ");
                for (int j = 0; j < MAX; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("��");
            }
            System.out.print("��");
            for (int i = 0; i <= 2 * MAX; i++)
            {
                System.out.print("��");
            }
            System.out.println("��");

            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.println("1.�ð���� ȸ�� | 2.�ݽð���� ȸ�� | 3.������ ���� | 4.����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.print("����>>>");
            int num = s1.nextInt();

            switch (num)
            {
                case 1: // �ð���� ȸ��

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
                case 2: // �ݽð���� ȸ��

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
                case 3: // ������ ����

                    int[] tempCnt = new int[MAX];
                    int cnt;

                    for (int i = 0; i < MAX; i++) // �� ���� �������� ���Ͽ� tempCnt�迭�� ����
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

                    for (int i = 0; i < MAX; i++) // arr �迭 �ʱ�ȭ
                    {
                        for (int j = 0; j < MAX; j++)
                        {
                            arr[i][j] = 0;
                        }
                    }

                    for (int j = 0; j < MAX; j++) // �� ���� �������� ������ tempCnt�迭
                                                  // �̿��Ͽ� ���ĵ� arr2���迭 ����
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
                    System.out.println("���α׷� ����");
                    break;
            }
        }
    }

}
