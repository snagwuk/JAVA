package ch10;

public class NewExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            statInstall();
            copyFiles();
        }
        catch (SpaceException e)
        {
            // TODO: handle exception
            System.out.println("에러 메시지 : " +  e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보후에 다시 설치하시기 바랍니다.");
        }
        catch (MemoryException me)
        {
            // TODO: handle exception
            System.out.println("에러 메시지 : " +  me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
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

    private static void statInstall() throws SpaceException, MemoryException
    {
        // TODO Auto-generated method stub
        if(!enoughSpace())
            throw new SpaceException("설치공간이 부족합니다.");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }

    private static boolean enoughMemory()
    {
        // TODO Auto-generated method stub
        return false;
    }

    private static boolean enoughSpace()
    {
        // TODO Auto-generated method stub
        return true;
    }
}
@SuppressWarnings("serial")
class SpaceException extends Exception
{
    SpaceException(String s)
    {
        super(s);
        }
}
@SuppressWarnings("serial")
class MemoryException extends Exception
{
    MemoryException(String s)
    {
        super(s);
        }
}
