package ch04;
import java.util.Scanner;
public class DoWhile
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램 종료  = q");
        Scanner s1 = new Scanner(System.in);
        String input;
        do
        {
            System.out.print(">");
            input = s1.nextLine();
            System.out.println(input);
        }
        while(! input.equals("q"));
        System.out.println();
        System.out.println("프로그램종료");
    }
}
