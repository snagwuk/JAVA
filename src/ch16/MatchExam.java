package ch16;

import java.util.Arrays;

public class MatchExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] intArr = {2,4,6};
        boolean result = Arrays.stream(intArr).allMatch(a -> a%2==0);
        System.out.println("��� 2�� ����ΰ�? " + result);
        
        result = Arrays.stream(intArr).anyMatch(a -> a%3==0);
        System.out.println("�ϳ��� 3�� ����� �ִ°�? " + result);
        
        result = Arrays.stream(intArr).noneMatch(a -> a%3==0);
        System.out.println("3�� ����� ���°�? " + result);
    }
    
}
