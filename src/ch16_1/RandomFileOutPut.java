package ch16_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RandomFileOutPut
{
    
    public static void main(String[] args) throws IOException
    {
        
        int randomNum = 1000;
        
        PrintStream ps = null;
        FileOutputStream fos = null;
        String [] car = {"¾Æ¹Ý¶¼","±×·£Á®","BMW","º¥Ã÷","¶ó¼¼¶ì"};
        String [] remark = {"¸ô¶ó¿ä","½È¾î¿ä","±×³ÉÀÌ¿ä"};
        try
        {
            fos = new FileOutputStream("src/ch16_1/product.txt",true);
            ps = new PrintStream(fos);
            
            for(int i =0; i < randomNum; i++)
            {
                int chk = (int)(Math.random()*3)+1;
                String line = ""+((int)(Math.random()*12)+1)+","
                        +chk+","+""+(car[(int)(Math.random()*5)])+","+((int)(Math.random()*5)+1);
                if(chk==3) 
                    line += "," +remark[(int)(Math.random()*3)] ;
                ps.append(line+"\n");
            }
            fos.close();
            ps.close();
        }
        catch (FileNotFoundException e)
        {
            // TODO: handle exception
            System.out.println("FileNotFound");
        }
        
       
    }
    
}
