package ch11;

import java.util.Objects;

public class NullExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str1 = "ȫ�浿";
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
            String name = Objects.requireNonNull(str2,"�̸��� �����ϴ�.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        try
        {
            String name = Objects.requireNonNull(str2,()->"�̸��� �����ϴ�.");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
    
}
