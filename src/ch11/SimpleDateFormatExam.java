package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));
        
        sdf = new SimpleDateFormat("yyyy년MM월dd일");
        System.out.println(sdf.format(now));
        
        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("이달의 d번째날");
        System.out.println(sdf.format(now));
        
        
        
        
    }
    
}
