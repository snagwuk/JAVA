package ch11;

public class StringBuilderExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        sb.append("java ");
        sb.append("Program Study");
        System.out.println(sb.toString());
        sb.insert(4, "2");
        System.out.println(sb.toString());
        sb.setCharAt(4, '6');
        System.out.println(sb.toString());
        sb.replace(6, 13, "Book");
        System.out.println(sb.toString());
        sb.delete(4,5);
        System.out.println(sb.toString());
        int legth = sb.length();
        System.out.println("ÃÑ¹®Àå¼ö : "+legth);
        String result = sb.toString();
        System.out.println(result);
        
    }
    
}
