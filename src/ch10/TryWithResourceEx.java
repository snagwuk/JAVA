package ch10;

public class TryWithResourceEx
{
    
    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        try (CloseableResource cr = new CloseableResource())
        {
            cr.exceptionWork(false);
        }
        catch (WorkException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        catch (CloseException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println();
        
        try (CloseableResource cr = new CloseableResource())
        {
            cr.exceptionWork(true);
        }
        catch (WorkException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        catch (CloseException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println();
    }
    
}

class CloseableResource implements AutoCloseable
{
    public void exceptionWork(boolean exception) throws WorkException
    {
        System.out.println("exceptionWork" + exception +"�� ȣ���");
        if (exception) throw new WorkException("workException �߻�");
    }
    
    @Override
    public void close() throws CloseException
    {
        // TODO Auto-generated method stub
        System.out.println("close()�� ȣ���");
        throw new CloseException("closeException�߻�!!");
    }
    
}

@SuppressWarnings("serial")
class WorkException extends Exception
{
    WorkException(String a)
    {
        super(a);
    }
}

@SuppressWarnings("serial")
class CloseException extends Exception
{
    CloseException(String a)
    {
        super(a);
    }
}
