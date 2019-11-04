package ch15;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam
{
    
    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        Properties properties = new Properties();
        String path = PropertiesExam.class.getResource("database.properties").getPath();
        System.out.println(path);
        
        path = URLDecoder.decode(path,"utf-8");
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("driver = " + driver);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        
    }
    
}
