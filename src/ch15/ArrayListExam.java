package ch15;

import java.util.ArrayList;
import java.util.List;

class ArrayListExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"Database");
        list.add("iBATIS");
        int size = list.size();
        System.out.println(" ÃÑ °´Ã¼¼ö : " +  size);
        String skill = list.get(2);
        System.out.println("2 : " + skill);
        System.out.println();
        
        for(int i = 0 ; i < list.size(); i ++)
            System.out.println( i + " : " + list.get(i));
        
        System.out.println();
        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");
        for(int i = 0 ; i < list.size(); i ++)
            System.out.println( i + " : " + list.get(i));
        System.out.println();

    }
    
}
