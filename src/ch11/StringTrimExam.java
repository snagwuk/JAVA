package ch11;

public class StringTrimExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String t1 = "  02";
        String t2 = "123  ";
        String t3 = "  12  34  ";
        
        String tel = t1.trim() + t2.trim()+t3.trim();
        System.out.println(tel);
        
    }
    
}
