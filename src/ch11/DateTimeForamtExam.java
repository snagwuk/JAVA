package ch11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeForamtExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter datetf = DateTimeFormatter.ofPattern("yyyy��M��d�� a h�� m��");
        String nows = now.format(datetf);
        System.out.println(nows);
    }
    
}
