package ch10;

class NotExistIDException extends Exception
{
    NotExistIDException(){}
    NotExistIDException(String message)
    {
        super(message);
    }
}
class WrongPasswordExcetion extends Exception
{
    WrongPasswordExcetion(){}
    WrongPasswordExcetion(String message)
    {
        super(message);
    }
}
public class LoginExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            login("White","12345");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        try
        {
            login("blue","54321");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    private static void login(String id, String password)  throws NotExistIDException, WrongPasswordExcetion
    {
        // TODO Auto-generated method stub
        if(!id.equals("blue"))
        {
            throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
        }
        if(!password.equals("12345"))
        {
            throw new WrongPasswordExcetion("�н����尡 Ʋ���ϴ�.");
        }
    }
    
}
