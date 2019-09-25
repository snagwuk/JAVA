package ch04;

public class ForExec02
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

       /* System.out.println("랜덤한 홀수를 입력하세요");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("입력수 : " + n);*/
        int n = 9;
        //int n = ((int)(Math.random()*11)+5)*2+1;
        System.out.println("입력수 : " + n);

        int p1 = n/2;
        int p2 = n/2;

        for (int  i = 0; i<n; i++)
        {
            for(int j = 0; j <n ; j++)
            {
                if(j == p1 || j == p2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            p1 -= 1;
            p2 += 1;

            if (p1 == 0)
            {
                p1 = n - 1;
                p2 = 0;
            }
            System.out.println();
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        for (int z = 1; z <= n; z++)
        {
            if (z <= n / 2 + 1)
            {
                for (int i = 1; i <= (n / 2 + 1) - z; i++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < (2*(z-1))-1 ;j++)
                {
                    System.out.print(" ");
                }

            }
            else
            {
                for (int i = 1; i <= z - (n / 2 + 1); i++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2*(n-z)-1 ;j++)
                {
                    System.out.print(" ");
                }
            }



            if(z != n && z != 1)
                System.out.print("*");

            System.out.println();
        }

    }

}
