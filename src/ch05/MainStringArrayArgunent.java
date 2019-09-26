package ch05;

public class MainStringArrayArgunent
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        if(args.length != 2)
        {
            System.out.println("프로그램의 사용법");
            System.out.println("java");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        System.out.println(num1 + " + " + num2 + " = " + num1+num2 );
    }

}
