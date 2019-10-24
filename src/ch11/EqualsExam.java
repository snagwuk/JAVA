package ch11;

import java.util.Arrays;

public class EqualsExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[][] original = {{1,2},{3,4}};
        
        
        System.out.println("���� ������ ��");
        int[][] cloned1 = Arrays.copyOf(original, original.length);
        System.out.println("�迭 ���� �� : " + original.equals(cloned1));
        System.out.println("1���迭 �׸� ��" + Arrays.equals(original, cloned1));
        System.out.println("��ø �迭 �׸� ��"+ Arrays.deepEquals(original, cloned1));
        
        System.out.println();
        
        System.out.println("���� ������ ��");
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("�迭 ���� �� : " + original.equals(cloned2));
        System.out.println("1���迭 �׸� ��" + Arrays.equals(original, cloned2));
        System.out.println("��ø �迭 �׸� ��"+ Arrays.deepEquals(original, cloned2));
    }
    
}
