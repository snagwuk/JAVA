package ch16;

import java.util.Arrays;

public class LoopingExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] intArr = {1,2,3,4,5};
        System.out.println("[peek()�� �������� ȣ���� ���]");
        Arrays.stream(intArr).filter(a -> a%2 ==0 ).peek(n ->  System.out.println(n));
       
        System.out.println("[���� ó�� �޼ҵ带 �������� ó���� ���]");
        int total = Arrays.stream(intArr).filter(a -> a%2 ==0 ).peek(n ->  System.out.println(n)).sum();
        
        System.out.println("���� : " + total);
        System.out.println("[forEach()�� �������� ȣ���� ���]");
        Arrays.stream(intArr).filter(a -> a%2==0).forEach(n ->  System.out.println(n));
    }
    
}
