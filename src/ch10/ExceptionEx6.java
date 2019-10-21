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
            System.out.println("아이디를 입력해주세요");
            String inputId = sc.nextLine();
            System.out.println("비밀번호를 입력해주세요");
            String inputPw = sc.nextLine();
            if(id.equals(inputId) && pw.equals(inputPw))
                System.out.println("로그인성공");

            else if (!id.equals(inputId))
            {
                LoginFailException e = new LoginFailException("로그인 아이디가 틀립니다.");
                e.setCode(100);
                throw e;
            }
            else
            {
                LoginFailException e = new LoginFailException("비밀번호가 틀립니다.");
                e.setCode(200);
                throw e;
            }
                
        }
        catch (LoginFailException e)
        {
            // TODO: handle exception
            System.out.println("오류코드=" + e.getCode());
            System.out.println("오류메시지=" + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
