package ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        final int LIMIT = 10;
        String source = "01234569abcdefghijklmnopqrstuvwxyz123";
        int length = source.length();
        
        List<String> list = new ArrayList<String>(length/LIMIT +10);
        
        for(int i = 0 ; i < length; i +=LIMIT)
        {
            if(i + LIMIT < length)
                list.add(source.substring(i,i+LIMIT));
            else
                list.add(source.substring(i));
        }
        
        for (int i = 0 ; i < list.size(); i++)
            System.out.println(list.get(i));
    }
    
}
