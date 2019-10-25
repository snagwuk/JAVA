package ch11;

import java.text.MessageFormat;

public class MessageFormatExam
{
    public static void main(String[] args)
    {
        String id = "JAVA";
        String name = "신용권";
        String tel = "010-123-4567";
        
        String text = "회원 ID : {0}\n 회원리음: {1} \n 회원전화 : {2}";
        String result1 = MessageFormat.format(text, id,name,tel);
        System.out.println(result1);
        System.out.println();
        
        String sql = "insert into values ({0},{1},{2})";
        Object[] arg = {"'JAVA'","'신용권'","'010-456-7893'"};
        String result2 = MessageFormat.format(sql, id,name,tel);
        System.out.println(result2);
    }
}
