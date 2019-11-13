package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam
{
    
    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        OutputStream os = new FileOutputStream("c:/Temp/test.txt");
        byte[] data = "AasdfBC".getBytes();
        for (int i = 0; i < data.length; i++)
            os.write(data[i]);
        
        os.flush();
        os.close();
    }
    
}
