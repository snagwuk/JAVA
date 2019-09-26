package ch04;

public class IfLoopExam02
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int m=0; m<=9; m++)
        {

            for (int n=2; n<=9; n++)
            {
                if (m==0)
                    System.out.print("*** " + n + "´Ü ***"+ "\t");
                else
                    System.out.print(n + " X " + m +" = " + (m*n) + "\t");
            }
            System.out.println();
        }
    }

}
