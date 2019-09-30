package ch05;

import java.util.Scanner;

public class SpecialQ3
{

    static char[][] arr = {
            { '0', '0', '0', '0', '0', '0' },
            { '0', 'U', 'R', 'L', 'P', 'M' },
            { '0', 'X', 'P', 'R', 'E', 'T' },
            { '0', 'G', 'I', 'A', 'E', 'T' },
            { '0', 'X', 'T', 'N', 'Z', 'Y' },
            { '0', 'X', 'O', 'Q', 'R', 'S' }
            };

    static String word;

    public static boolean searchWord(int x, int y, String word)
    {
        if (x < 1 || x > 5 || y < 1 || y > 5) return false;
        if (arr[x][y] != word.charAt(0)) return false;
        // System.out.println("**"+x+","+y+" / " + word.charAt(0));
        if (word.length() == 1) return true;
        for (int i = (x - 1); i <= (x + 1); i++)
        {
            for (int j = (y - 1); j <= (y + 1); j++)
            {
                if (i == x && j == y)
                {
                    continue;
                }
                else
                {
                    if (searchWord(i, j, word.substring(1))) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        String[] wordArrS = { "REPEAT", "GIRL", "PRETTY", "KARA", "PANDORA","GIAZAPX", "ITNB" };
        for (String wordArr : wordArrS)
        {
            word = wordArr;
            int flag = 0;
            boolean result = false;
            for (int i = 1; i < arr.length; i++)
            {
                for (int j = 1; j < arr.length; j++)
                {
                    if (arr[i][j] == word.charAt(0))
                    {
                        result = searchWord(i, j, word);
                        if (result) flag = 1;
                    }
                }
            }
            if (flag == 1) result = true;
            System.out.println(word + "\t결과:" + result);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("영대문자입력(종료:ESC)>");
            word = sc.next();

            if (word.equals("esc") || word.equals("ESC"))
            {
                System.out.println("프로그램 종료");
                break;
            }
            int flag = 0;
            boolean result = false;
            for (int i = 1; i < arr.length; i++)
            {
                for (int j = 1; j < arr.length; j++)
                {

                    if (arr[i][j] == word.charAt(0))
                    {
                        result = searchWord(i, j, word);
                        if (result) flag = 1;
                    }
                }
            }
            if (flag == 1) result = true;
            System.out.println(word + "\t결과:" + result);
        }

    }

}
