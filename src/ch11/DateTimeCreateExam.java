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
        System.out.println("���� ��¥ : " + currDate);
        LocalDate targetDate = LocalDate.of(2024, 5, 10);
        System.out.println("��ǥ ��¥ : " +  targetDate);
        LocalTime currTime = LocalTime.now();
        System.out.println("���� �ð� : "+ currTime);
        LocalTime targetTime = LocalTime.of(6,30,0,0);
        System.out.println("���� �ð� : "+ targetTime);
        
        LocalDateTime currDT = LocalDateTime.now();
        System.out.println("���� ��¥ �ð� : "+ currDT);
        LocalDateTime targetDT = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("��ǥ ��¥ �ð� : "+ currDT);
        
        ZonedDateTime z = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("��������� : " + z);
        ZonedDateTime nw = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("����ð� " + nw);
    } 
    
}
