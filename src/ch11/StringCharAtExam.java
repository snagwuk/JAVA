package ch11;

public class StringCharAtExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String ssn = "010624-1230123";
        char sex = ssn.charAt(7);
        switch(sex)
        {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("남자입니다.");
                break;
        }
    }
    
}
