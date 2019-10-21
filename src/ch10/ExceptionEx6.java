package ch10;

import java.util.Scanner;

@SuppressWarnings("serial")
class LoginFailException extends Exception
{
    private int code;
    LoginFailException(String msg)
    {
        super(msg);
    }
    public int getCode()
    {
        return code;
    }
    public void setCode(int code)
    {
        this.code = code;
    }
}
public class ExceptionEx6
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        try
        {
            String id = "hongkd";
            String pw = "1234";
            Scanner sc = new Scanner(System.in);
            System.out.println("���̵� �Է����ּ���");
            String inputId = sc.nextLine();
            System.out.println("��й�ȣ�� �Է����ּ���");
            String inputPw = sc.nextLine();
            if(id.equals(inputId) && pw.equals(inputPw))
                System.out.println("�α��μ���");

            else if (!id.equals(inputId))
            {
                LoginFailException e = new LoginFailException("�α��� ���̵� Ʋ���ϴ�.");
                e.setCode(100);
                throw e;
            }
            else
            {
                LoginFailException e = new LoginFailException("��й�ȣ�� Ʋ���ϴ�.");
                e.setCode(200);
                throw e;
            }
                
        }
        catch (LoginFailException e)
        {
            // TODO: handle exception
            System.out.println("�����ڵ�=" + e.getCode());
            System.out.println("�����޽���=" + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
