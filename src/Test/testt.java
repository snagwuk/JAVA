package Test;

public class testt extends par
{
    int c;
    testt(String b , int c)
    {
        super("������",b);
        this.c = c;
    }
    
}

class par
{
    String a;
    String b;
    par( String a,    String b)
    {
        this.a= a;
        this.b = b;
    }
    par(  String b)
    {
        this.a= "�����Դϴ�.";
        this.b = b;
    }
}