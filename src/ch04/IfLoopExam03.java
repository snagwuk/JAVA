package ch04;

public class IfLoopExam03
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int num = ((int)(Math.random()*11)+5)*2+1;
        int n = 7;

        int cnt = 0;
        for(int i = n; i>0;i=i-2)
            cnt += 2 * (i);
        cnt-=1;
        System.out.println(cnt);
        int p1 = 0;
        int p2 = n - 1;

        for (int  i = 0; i<n; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                if((j>=p1 && j<=p2) || (j <=p1 && j>=p2))
                    //System.out.print(cnt-- + "  ");
                    System.out.printf("%3d   ",cnt--);
                else
                    System.out.print("      ");
            }
            p1 +=1;
            p2 -=1;
            System.out.println();
        }
    }

}
