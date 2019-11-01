package ch14;
interface MyFunctionalInterface 
{
    public void method();
}
public class MyFunctionalInterfaceExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MyFunctionalInterface fi;
        fi = ()->{
            String str = "method call 1";
            System.out.println(str);
        };
        fi.method();
        
        fi = () ->{
            String str = "method call 2";
            System.out.println(str);
        };
        fi.method();
        
        fi = () ->{
            String str = "method call 3";
            System.out.println(str);
        };
        fi.method();
    }
    
}
