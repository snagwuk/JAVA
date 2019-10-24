package ch11;

public class StringToLowerUpperCaseExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        
        String lowerstr1 = str1.toLowerCase();
        String lowerstr2 = str2.toLowerCase();
        System.out.println(lowerstr1.equals(lowerstr2));
        System.out.println(lowerstr1.equalsIgnoreCase(lowerstr2));
    }
    
}
