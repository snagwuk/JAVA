package ch10;

public class FinallyTest
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            statInstall();
            copyFiles();
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles()
    {
        // TODO Auto-generated method stub
        
    }

    private static void copyFiles()
    {
        // TODO Auto-generated method stub
        
    }

    private static void statInstall()
    {
        // TODO Auto-generated method stub
        
    }
    
}
