package ch11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeForamtExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter datetf = DateTimeFormatter.ofPattern("yyyy년M월d일 a h시 m분");
        String nows = now.format(datetf);
        System.out.println(nows);
    }
    
}
