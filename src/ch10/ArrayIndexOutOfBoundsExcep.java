package ch10;

public class ArrayIndexOutOfBoundsExcep
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        if(args.length == 2)
        {

            System.out.println("args[0]="+args[0]);
            System.out.println("args[1]="+args[1]);
        }
        else
        {
            System.out.println("������");
            System.out.println("JAVA ArrayIndexOutOfBoundsExcep ��1 ��2");
            return;
        }
        
        String data1 = args[0];
        String data2 = args[1];
        System.out.println("args[0]="+data1);
        System.out.println("args[1]="+data2);
        
     
    }
    
}
