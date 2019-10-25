package ch11;

import java.text.MessageFormat;

public class MessageFormatExam
{
    public static void main(String[] args)
    {
        String id = "JAVA";
        String name = "�ſ��";
        String tel = "010-123-4567";
        
        String text = "ȸ�� ID : {0}\n ȸ������: {1} \n ȸ����ȭ : {2}";
        String result1 = MessageFormat.format(text, id,name,tel);
        System.out.println(result1);
        System.out.println();
        
        String sql = "insert into values ({0},{1},{2})";
        Object[] arg = {"'JAVA'","'�ſ��'","'010-456-7893'"};
        String result2 = MessageFormat.format(sql, id,name,tel);
        System.out.println(result2);
    }
}
