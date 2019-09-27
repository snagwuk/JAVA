package ch05;

public class ArrayEx15
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int [][] score = {
                {100,80,90},
                {80,80,70},
                {80,75,90},
                {90,75,95},
                {100,60,75}
        };

        int total[] = new int[3];
        System.out.println("\t국어\t영어\t수학\t총점\t평균");

        for(int i = 0 ; i <score.length;i++ )
        {
            System.out.print((i+1)+"번학생:\t");
            int sum = 0;
            for(int j = 0 ; j <score[i].length;j++ )
            {
                System.out.print(score[i][j]+"\t");
                sum += score[i][j];
                total[j] += score[i][j];
            }
            System.out.println(sum + "\t" + (double)sum / score[i].length);
        }
        System.out.print("합계:");

        for(int i = 0 ; i <total.length;i++ )
        {
            System.out.print("\t" + total[i] );
        }



    }

}
