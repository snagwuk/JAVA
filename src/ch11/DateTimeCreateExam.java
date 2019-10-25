package ch11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDate currDate = LocalDate.now();
        System.out.println("현재 날짜 : " + currDate);
        LocalDate targetDate = LocalDate.of(2024, 5, 10);
        System.out.println("목표 날짜 : " +  targetDate);
        LocalTime currTime = LocalTime.now();
        System.out.println("현재 시간 : "+ currTime);
        LocalTime targetTime = LocalTime.of(6,30,0,0);
        System.out.println("현재 시간 : "+ targetTime);
        
        LocalDateTime currDT = LocalDateTime.now();
        System.out.println("현재 날짜 시간 : "+ currDT);
        LocalDateTime targetDT = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("목표 날짜 시간 : "+ currDT);
        
        ZonedDateTime z = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정세계시 : " + z);
        ZonedDateTime nw = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("뉴욕시간 " + nw);
    } 
    
}
