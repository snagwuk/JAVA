package ch05;

import java.util.Scanner;

public class MultiArrEx4
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[][] words = {
                {"chair","����"},
                {"computer","��ǻ��"},
                {"integer","����"}
        };


        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < words.length; i++ )
        {
            System.out.printf("Q%d, %s�� ���� : ", i+1 , words[i][0]);
            String tmp = sc.nextLine();
            if(tmp.equals(words[i][1]))
            {
                System.out.printf("�����Դϴ�.\n");
            }
            else
                System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.\n" ,words[i][1] );
        }
    }

}
