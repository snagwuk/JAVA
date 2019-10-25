package ch11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        DateTimeFormatter fmr;
        LocalDate ld;
        ld = LocalDate.parse("2024-05-21");
        System.out.println(ld);
        
        fmr = DateTimeFormatter.ISO_LOCAL_DATE;
        ld = LocalDate.parse("2024-05-21",fmr);
        System.out.println(ld);
        
        fmr = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        ld = LocalDate.parse("2024/05/21",fmr);
        System.out.println(ld);
        
        fmr = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        ld = LocalDate.parse("2024.05.21",fmr);
        System.out.println(ld);
    }
    
}
