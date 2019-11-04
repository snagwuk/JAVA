package ch15;

import java.util.TreeSet;

public class TreeSetExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(88));
        Integer score = null;
        
        score = scores.first(); 
        System.out.println("���峷������ : " + score);
        
        score = scores.last();
        System.out.println("����������� : " + score);
        
        score = scores.lower(new Integer(95));
        System.out.println("95�� �Ʒ� ���� : " + score);
        
        
        score = scores.higher(new Integer(95));
        System.out.println("95�� ���� ���� : " + score);
        
        score = scores.floor(new Integer(95));
        System.out.println("95���̰ų� �ٷξƷ� ���� : " + score);
        
        score = scores.ceiling(new Integer(85));
        System.out.println("85���̰ų� �ٷ����� ���� : " + score);
        
        while(!scores.isEmpty())
        {
            score= scores.pollFirst();
            System.out.println(score + "(������ü��:" + scores.size() + ")");
        }
        
        
        
    }
    
}
