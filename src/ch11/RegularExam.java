package ch11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] data = {"bat","baby","bonus","Ca","count","cTT","date","disk","c","car","cA","c.","c0","c#","combat"};
        
        Pattern p = Pattern.compile("c[a-zA-z]*");
        for(String s : data)
        {
            Matcher m = p.matcher(s);
            if(m.matches())
                System.out.print(s + ", ");
        }
        
        
        System.out.println();
        String names = "È«±æµ¿ ,   ±è»ñ°«,ÀÌ¸ù·æ     ,     ¼ºÃáÇâ     ,    ÀÓ²©Á¤";
        String[] arr = names.split("\\s*,\\s*");
        //String[] arr = names.split(",");
        for(String s : arr)
        {
            System.out.println(s);
        }
    }
    
}
