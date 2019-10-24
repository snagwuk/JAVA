package ch11;

public class MathExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("v1="+v1 +"\nv2=" + v2);  
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println("v3="+v3 +"\nv4=" + v4); 
        
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println("v5="+v5 +"\nv6=" + v6); 
        
        int v7 = Math.max(5, 9);
        double v8 = Math.max(5.3,2.5);
        System.out.println("v7="+v7 +"\nv8=" + v8); 
        
        int v9 = Math.min(5, 9);
        double v10 = Math.min(5.3,2.5);
        System.out.println("v9="+v9 +"\nv10=" + v10); 
        double v11 = Math.random();
        System.out.println("v11="+v11);  
        
        double v12 = Math.rint(5.9);
        double v13 = Math.rint(5.7);
        System.out.println("v12="+v12 +"\nv13=" + v13); 
        
        long v14 = Math.round(5.9);
        long v15 = Math.round(5.7);
        System.out.println("v14="+v14 +"\nv15=" + v15); 
        
        
        double v16 = 12.3456;
        double v17 = v16 * 100;
        long tmp = Math.round(v17);
        double v18 = tmp / 100.0;
        
        System.out.println("v18="+v18); 
        
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
        System.out.println();
        System.out.println();
    }
    
}
