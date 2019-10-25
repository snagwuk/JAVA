package ch11;

import java.util.TimeZone;

public class PrintTimeZoneID
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] av = TimeZone.getAvailableIDs();
        for(String x : av)
            System.out.println(x);
    }
    
}
