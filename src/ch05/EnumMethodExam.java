package ch05;

public class EnumMethodExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);

        int ord = today.ordinal();
        System.out.println(ord);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        Week WeekDay = Week.valueOf("SUNDAY");
        if(WeekDay == Week.SATURDAY || WeekDay == Week.SUNDAY)
            System.out.println("주말이군요");
        else
            System.out.println("평일이군요");
        Week[] days =Week.values();
        for(Week day : days)
        {
            System.out.println(day);
        }


    }

}
