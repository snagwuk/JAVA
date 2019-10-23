package ch11;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        
        System.out.println("�ü���̸�:" + osName);
        System.out.println("������̸�:" + userName);
        System.out.println("����� Ȩ���丮:" + userHome);
        Properties props = System.getProperties();
        Set keys = props.keySet();
        
        for(Object objkey : keys)
        {
            String key = (String) objkey;
            String value = System.getProperty(key);
            System.out.println("["+key+ "]" + value);
        }
        }
    
}
