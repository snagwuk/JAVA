package ch06;

class Phone2
{
    final String ssn;
    String a;
    public Phone2(String a, String b)
    {
        this.ssn = a;
        this.a = b;
    }
    String color;
    boolean power;
    String no;
    int serialno;
    static int cnt;
    @Override
    public String toString()
    {
        return serialno + ":"+color+","+no;
    }
}
public class Phone2Ex1
{

    public static void main(String[] args)
    {
        Phone2 x = new Phone2("123","asd");
        System.out.println(x.ssn);
/*
        Phone2[] p = new Phone2[3];
        for(int i = 0 ; i < p.length;i++)
        {
            //p[i] = new Phone2();
            p[i].color = "³ë¶û";
            p[i].no = "¹ÌÁ¤";
            p[i].serialno = ++p[i].cnt;
        }

        for(Phone2 p2 : p)
            System.out.println(p2);*/

    }

}
