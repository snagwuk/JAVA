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
        System.out.println("\t����\t����\t����\t����\t���");

        for(int i = 0 ; i <score.length;i++ )
        {
            System.out.print((i+1)+"���л�:\t");
            int sum = 0;
            for(int j = 0 ; j <score[i].length;j++ )
            {
                System.out.print(score[i][j]+"\t");
                sum += score[i][j];
                total[j] += score[i][j];
            }
            System.out.println(sum + "\t" + (double)sum / score[i].length);
        }
        System.out.print("�հ�:");

        for(int i = 0 ; i <total.length;i++ )
        {
            System.out.print("\t" + total[i] );
        }



    }

}
