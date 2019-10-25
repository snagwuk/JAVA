package ch11;
public class Calendar
{
    
    public static void main(String[] args)
    {
        String y = "2019";
        String m = "10";
        int year = Integer.parseInt(y);
        int month = Integer.parseInt(m);
        
        int START_DAT_OF_WEEK = 0 ;
        int END_DAY=0;
        java.util.Calendar sDay = java.util.Calendar.getInstance();
        java.util.Calendar eDay = java.util.Calendar.getInstance();
        
        sDay .set(year, month-1,1);
        eDay .set(year, month,1);
        
        eDay.add(java.util.Calendar.DATE, -1);
        START_DAT_OF_WEEK = sDay.get(java.util.Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(java.util.Calendar.DATE);
        System.out.println("      "+y+"³â" + m  + " ¿ù");
        System.out.println(" SU MO TU WE TH FR SA");
        for(int i =1; i < START_DAT_OF_WEEK ;i++)
        {
            System.out.print("   ");
        }
        for(int i =1 , n=START_DAT_OF_WEEK; i<=END_DAY;i++,n++)
        {
            System.out.print((i <10) ? "  " + i : " "+i);
            if(n%7 ==0)
                System.out.println();
        }
        
        
    }
}
