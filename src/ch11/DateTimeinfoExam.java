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
        
        String str = now.getYear() + "�� " ;
        str += now.getMonthValue() + "�� " ;
        str += now.getDayOfMonth() + "�� " ;
        str += now.getDayOfWeek() + "  " ;
        str += now.getHour() + "�� " ;
        str += now.getMinute() + "�� " ;
        str += now.getSecond() + "�� " ;
        str += now.getNano() + "������ " ;
        System.out.println(str);
    }
    
}
