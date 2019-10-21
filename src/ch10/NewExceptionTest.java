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
            System.out.println("���� �޽��� : " +  e.getMessage());
            e.printStackTrace();
            System.out.println("������ Ȯ���Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
        }
        catch (MemoryException me)
        {
            // TODO: handle exception
            System.out.println("���� �޽��� : " +  me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
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
            throw new SpaceException("��ġ������ �����մϴ�.");
        if(!enoughMemory())
            throw new MemoryException("�޸𸮰� �����մϴ�.");
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
