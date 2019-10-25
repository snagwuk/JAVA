package ch11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 : " + now);
        LocalDateTime TargetdateTime = null;
        TargetdateTime = now.withYear(2024).withMonth(10).withDayOfMonth(5).withHour(13).withMinute(30).withSecond(20);
        System.out.println("직접변경 : " +TargetdateTime );
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("이번 해의 첫 일: " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("이번해의 마지막일 : " + TargetdateTime);
        
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("다음해의 첫일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("이번달의 첫일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("이번달의 마지막일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("다음달의 첫일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("이번달의 첫월요일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("돌아오늘 월요일 : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("지난 월요일 : " + TargetdateTime);
    }
    
}
