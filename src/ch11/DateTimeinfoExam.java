package ch11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeinfoExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime now= LocalDateTime.now();
        System.out.println(now);
        
        String str = now.getYear() + "년 " ;
        str += now.getMonthValue() + "월 " ;
        str += now.getDayOfMonth() + "일 " ;
        str += now.getDayOfWeek() + "  " ;
        str += now.getHour() + "시 " ;
        str += now.getMinute() + "분 " ;
        str += now.getSecond() + "초 " ;
        str += now.getNano() + "나노초 " ;
        System.out.println(str);
    }
    
}
