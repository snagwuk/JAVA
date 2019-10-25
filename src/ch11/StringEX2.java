package ch11;

public class StringEX2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String a = "ABC";
        System.out.println(a);
        change(a);
        System.out.println(a);
    }

    private static void change(String x)
    {
        // TODO Auto-generated method stub
        x += "DEF";
        System.out.println(x);
    }
    
}
