package ch18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam2
{
    
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        Writer writer = new FileWriter("c:/Temp/test.txt");
        char[] data = "ȫ�浿".toCharArray();
        for(int i = 0 ; i < data.length; i++)
            writer.write(data[i]);
        writer.close();
    }
   
    
}
