package ch14;
interface MyFunctionalInterface2
{
    public int method(int x, int y);
}
public class MyFunctionalIntefaceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MyFunctionalInterface2 fi;
        fi = (x,y) -> {
            int result = x+y;
            return result;
        };
        System.out.println(fi.method(2,5));
        fi = (x,y) -> 
        {
            return x+y;
        };
        System.out.println(fi.method(2,5));
        
        fi = (x,y) -> x + y;
        System.out.println(fi.method(2,5));
        
        fi = (x,y) -> sum(x,y);
        System.out.println(fi.method(2,5));
    }

    private static int sum(int x, int y)
    {
        // TODO Auto-generated method stub
        return (x+y);
    }
    
}


