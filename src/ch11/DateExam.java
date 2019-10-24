package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Date now = new Date();
        String str = now.toString();
        System.out.println(str);
        
        SimpleDateFormat sdf = new SimpleDateFormat("1994년08월23일 11시11분11초");
        String str2 = sdf.format(now);
        System.out.println(str2);
        
    }
    
}
