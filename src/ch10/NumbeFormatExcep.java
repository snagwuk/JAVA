package ch10;

public class NumbeFormatExcep
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String data1 = "100";
        String data2 = "100a";
        
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
        
        int result = value1+value2;
        System.out.println(data1+ "+"+ data2 + "=" + result);
    }
    
}
