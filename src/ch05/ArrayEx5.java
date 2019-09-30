package ch05;

public class ArrayEx5
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] balls = new int[45];
        for (int i = 0; i < balls.length; i++)
            balls[i] = i + 1;

        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * 45);
            int t = (int) (Math.random() * 45);

            int tmp = balls[f];
            balls[f] = balls[t];
            balls[t] = tmp;
        }



        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++)
        {
            lotto[i] = balls[i];
        }
        for (int b : lotto)
        {
            System.out.print(b + ",");
        }
        System.out.println();
        for (int i = 0; i < lotto.length; i++)
        {
            boolean change = false;
            for (int j = 0; j < lotto.length - i - 1; j++)
            {
                if (lotto[j] > lotto[j + 1])
                {
                    int tmp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = tmp;
                    change = true;
                }
            }
            if (!change) break;
            for(int b : lotto)
            {
                System.out.print(b + ",");
            }
            System.out.println();
        }
    }

}
