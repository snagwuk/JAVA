package ch15;

import java.util.HashSet;
import java.util.Set;

public class SetHashSetEx1
{
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Object[] objarr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
        
        Set set = new HashSet();
        
        for(int i = 0 ; i < objarr.length; i++)
            set.add(objarr[i]);
        
        System.out.println(set);
    }
    
}
