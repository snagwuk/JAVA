package ch11;

import java.util.Objects;

public class NullExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str1 = "홍길동";
        String str2 = null;
        System.out.println(Objects.requireNonNull(str1));
        try
        {
            String name = Objects.requireNonNull(str2);
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        try
        {
            String name = Objects.requireNonNull(str2,"이름이 없습니다.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        try
        {
            String name = Objects.requireNonNull(str2,()->"이름이 없습니다.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
    
}
