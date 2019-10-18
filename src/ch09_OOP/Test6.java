package ch09_OOP;
interface Beta
{
    
}
class Alpha implements Beta
{
    String testIt()
    {
        return "tested";
    }
}
public class Test6
{
    static Beta getIt()
    {
        return new Alpha();
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        // Alpha b = (Alpha)getIt();
        Beta b = getIt();
        
        if(b instanceof Alpha)
        {
            Alpha a = (Alpha)b;
            System.out.println(a.testIt());
        }
        //System.out.println(b.testIt());
    }
    
}
