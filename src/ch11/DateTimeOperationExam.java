package ch11;

import java.time.LocalDateTime;

public class DateTimeOperationExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        LocalDateTime tar = now.plusYears(1).plusDays(2).plusHours(3).plusMinutes(4).minusMonths(2).minusWeeks(1);
        System.out.println(tar);
    }
    
}
