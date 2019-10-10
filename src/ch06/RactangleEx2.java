package ch06;

class Ractangle2
{
    public static int cnt=0;
    public int serialno;
    int width;
    int height;
    void area()
    {
        // TODO Auto-generated method stub
        System.out.println(serialno + "번 사각형의 넓이 : "  + (width*height));

    }
    public void length()
    {
        // TODO Auto-generated method stub
        System.out.println(serialno + "번 사각형의 둘레 : "  + 2*(width+height));

    }
    public boolean isSquare()
    {
        // TODO Auto-generated method stub
              return width == height;
    }


    Ractangle2(int a, int b)
    {
        width = a;
        height = b;
        serialno = ++cnt;

    }
}
public class RactangleEx2
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Ractangle2[] rarr = new Ractangle2[3];
        rarr[0] = new Ractangle2(10,10);
        rarr[1] = new Ractangle2(15,20);
        rarr[2] = new Ractangle2(20,5);
        for(Ractangle2 r : rarr)
        {
            r.area(); r.length();
            if(r.isSquare())
            {
                System.out.println(r.serialno + "번 사각형은 정사각형입니다.");
            }
            else
                System.out.println(r.serialno + "번 사각형은 직사각형입니다.");
        }

    }

}
