package ch05;

public class ArrayCreateByValueListExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int[] scores = {83,90,87};

        int sum2 = add(new int[] {83,91,87});
        System.out.println("2ÃÑÇÕ : " + sum2);

        int sum3 = add(scores);
        System.out.println("3ÃÑÇÕ : " + sum3);

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);

        int sum = 0;
        for(int i = 0 ; i < 3; i++)
        {
            sum+= scores[i];
        }
        System.out.println("ÃÑÇÕ : " + sum);
        double avg = (double) sum /3;
        System.out.println("Æò±Õ : " + avg);

    }

    private static int add(int[] scores)
    {
        int sum = 0 ;
        for(int i = 0; i<3; i++)
        {
            sum += scores[i];
        }
        return sum;
    }


}
