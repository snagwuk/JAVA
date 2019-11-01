package ch14;

import java.util.function.IntSupplier;

public class SupplierExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        IntSupplier intsup = () -> 
        {
            int num = (int) (Math.random()*6) +1 ;
            return num;
        };
        int num = intsup.getAsInt();
        System.out.println("´«ÀÇ ¼ö : " + num);
    }
    
}
