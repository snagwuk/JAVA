package ch11;

public class ExitExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.setSecurityManager(new SecurityManager()
        {
            public void checkExit(int status) {
                if (status != 5)
                    throw new SecurityException();
            }
        
    } );
        for(int i = 0; i <10; i++)
        {
            System.out.println(i);
            try
            {
                System.exit(i);
            }
            catch (SecurityException e)
            {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    
}
