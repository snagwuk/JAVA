package ch10;

import java.io.FileInputStream;

public class TryWithResourceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try (FileInputStream fis = new FileInputStream("file.txt"))
        {
            fis.read();
            throw new Exception();
                
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
    
}
