package ch11;

public class StringSubstringExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String sn = "123456-1234567";
        
        String f = sn.substring(0,6);
        System.out.println(f);
        
        String b = sn.substring(7);
        System.out.println(b);
    }
    
}
