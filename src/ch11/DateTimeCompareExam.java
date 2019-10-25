package ch11;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime startDateTime = LocalDateTime.of(2023,1,1,9,0,0);
        System.out.println("시작일 : " + startDateTime);
        
        LocalDateTime endDateTime = LocalDateTime.of(2024,3,31,18,0,0);
        System.out.println("시작일 : " + endDateTime);
        
        if(startDateTime.isBefore(endDateTime))
            System.out.println("진행 중입니다.");
        else if (startDateTime.equals(endDateTime))
            System.out.println("종료합니다.");
        else if (startDateTime.isAfter(endDateTime))
            System.out.println("종료했습니다.");
        
        System.out.println("[종료까지 남은신간]");

        long reaminY = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long reaminM = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long reaminD = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long reaminH = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long reaminm = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long reaminS = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        reaminY = ChronoUnit.YEARS.between(startDateTime, endDateTime);
        reaminM = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
        reaminD = ChronoUnit.DAYS.between(startDateTime, endDateTime);
        reaminH = ChronoUnit.HOURS.between(startDateTime, endDateTime);
        reaminm = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
        reaminS = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
        System.out.println("남은  해: " + reaminY);
        System.out.println("남은  월: " + reaminM);
        System.out.println("남은  일: " + reaminD);
        System.out.println("남은  시: " + reaminH);
        System.out.println("남은  분: " + reaminm);
        System.out.println("남은  초: " + reaminS);
    
    
    }
    
}
