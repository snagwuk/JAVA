package ch11;

public class AutoBoxingUnBoxingExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Integer obj = 100;
        System.out.println("value:"+obj.intValue());
        
        int value = obj;
        System.out.println("value:"+value);
        
        int result = obj+100;
        System.out.println("value:"+result);
        
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");
        
        int val1 = obj1.intValue();
        int val2 = obj2.intValue();
        int val3 = obj3.intValue();
        
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
    
}
