package ch11;

import java.util.Arrays;

public class SortExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] score = {99,97,98};
        Arrays.sort(score);
        
        for(int i = 0 ; i < score.length; i++)
            System.out.println("score["+i+"]="+score[i]);
        
        System.out.println();
        String[] names = {"�垮瘚�","夢翕熱","梯團熱"};
        Arrays.sort(names);
        for(int i = 0 ; i < names.length; i++)
            System.out.println("names["+i+"]="+names[i]);

    }
    
}
