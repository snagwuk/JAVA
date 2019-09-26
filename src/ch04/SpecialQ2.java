package ch04;

import java.util.Scanner;

public class SpecialQ2
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        int numArr[][][] = new int[10][5][5];

        int temp0[][] = {
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[0] = temp0;
        int temp1[][] = {
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1}
                };
        numArr[1] = temp1;


        int temp2[][] = {
                {1,1,1,1,1},
                {0,0,0,0,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,1}
                };
        numArr[2] = temp2;
        int temp3[][] = {
                {1,1,1,1,1},
                {0,0,0,0,1},
                {1,1,1,1,1},
                {0,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[3] = temp3;
        int temp4[][] = {
                {1,0,0,1,0},
                {1,0,0,1,0},
                {1,0,0,1,0},
                {1,1,1,1,1},
                {0,0,0,1,0}
                };
        numArr[4] = temp4;
        int temp5[][] = {
                {1,1,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,1},
                {0,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[5] = temp5;
        int temp6[][] = {
                {1,1,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[6] = temp6;
        int temp7[][] = {
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1}
                };
        numArr[7] = temp7;
        int temp8[][] = {
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[8] = temp8;
        int temp9[][] = {
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,1,1,1,1},
                {0,0,0,0,1},
                {1,1,1,1,1}
                };
        numArr[9] = temp9;

        Scanner s1 = new Scanner(System.in);
        System.out.print("자연수 입력 : ");
        String num = s1.next();
        //String num = "1234";

        int numTemp = Integer.parseInt(num);
        int numLength[] = new int[num.length()];
        for (int x = num.length()-1 ; x >= 0 ; x--)
        {
            numLength[x] = numTemp % 10;
            numTemp = numTemp / 10;
        }

        System.out.println();

        int tempX = 0;
        for (int i = 0; i < 5; i++)
        {
            tempX = 0;
            for (int n = 0; n < num.length() ; n++)
            {
                for (int j = 0; j < 5 ; j++)
                {
                    System.out.print(numArr[numLength[tempX]][i][j] + " ");
                }
                tempX++;
                System.out.print(" ");
                }
            System.out.println();
        }



    }

}
