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
        System.out.println("���� : " + now);
        LocalDateTime TargetdateTime = null;
        TargetdateTime = now.withYear(2024).withMonth(10).withDayOfMonth(5).withHour(13).withMinute(30).withSecond(20);
        System.out.println("�������� : " +TargetdateTime );
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("�̹� ���� ù ��: " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("�̹����� �������� : " + TargetdateTime);
        
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("�������� ù�� : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("�̹����� ù�� : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("�̹����� �������� : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("�������� ù�� : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("�̹����� ù������ : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("���ƿ��� ������ : " + TargetdateTime);
        TargetdateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("���� ������ : " + TargetdateTime);
    }
    
}
