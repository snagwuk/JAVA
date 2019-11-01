package ch14;

import java.util.function.IntBinaryOperator;

public class OperatorExam
{
    private static int[] scores = {92,95,87};
    public static int maxOrMin(IntBinaryOperator operator)
    {
        int result = scores[0];
        for(int score : scores)
        {
            result = operator.applyAsInt(result, score);
        }
        return result;
        
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int max = maxOrMin((a,b) -> {if (a>=b) return a; else return b;});
        System.out.println("�ִ밪 : " + max);
        
        int min = maxOrMin((a,b) -> {if (a<b) return a; else return b;});
        System.out.println("�ִ밪 : " + min);
        
    }
    
}

