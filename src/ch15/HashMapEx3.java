package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3
{
    static HashMap<String, HashMap<String,String>> phoneBook = new HashMap<String, HashMap<String,String>>();
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        addPhoneNo("친구","이자바","010-111-111");
        addPhoneNo("친구","김자바","010-222-222");
        addPhoneNo("친구","김자바","010-333-333");
        addPhoneNo("회사","이대리","010-444-444");
        addPhoneNo("회사","김대리","010-555-555");
        addPhoneNo("회사","박대리","010-666-666");
        addPhoneNo("회사","이과장","010-777-777");
        addPhoneNo("세탁","010-888-888");
        printList();
    }
   
    @SuppressWarnings("unused")
    private static void addGroup(String groupName)
    {
        // TODO Auto-generated method stub
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap<String,String>() );
        
    }
   
    private static void addPhoneNo(String a, String b,
            String c)
    {
        // TODO Auto-generated method stub
        addGroup(a);
        HashMap<String,String> group = (HashMap)phoneBook.get(a);
        group.put(b, c);
    }
    private static void addPhoneNo(String string, String string2)
    {
        // TODO Auto-generated method stub
        addPhoneNo("기타", string,string2);
    }
    
    private static void printList()
    {
        // TODO Auto-generated method stub
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Map.Entry e = (Map.Entry)it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subit = subSet.iterator();   
            System.out.println(" * " + e.getKey() +"[" + subSet.size()+"]");
            while(subit.hasNext())
            {
                Map.Entry subE = (Map.Entry)subit.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }
        }
        
    }
    
}
