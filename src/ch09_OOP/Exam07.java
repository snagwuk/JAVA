package ch09_OOP;

public class Exam07
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str = "123";
        System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
        
        str = "1234o";
        System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
    }

    private static String isNumber(String str)
    {
        // TODO Auto-generated method stub
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) > '9' || str.charAt(i) < '0' )
            {
                return "�ƴմϴ�.";
            }
        }
        return "�½��ϴ�.";
    }
    
}
