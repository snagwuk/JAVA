package ch06;

class Rectangle
{

    public static int cnt;
    public int serialno;
    public int width;
    public int height;
    public void area()
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

}
public class RactangleEx1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Rectangle[] rarr = new Rectangle[3];
        rarr[0] = new Rectangle();
        rarr[0].serialno = ++Rectangle.cnt;
        rarr[0].width = 10;
        rarr[0].height = 10;

        rarr[1] = new Rectangle();
        rarr[1].serialno = ++Rectangle.cnt;
        rarr[1].width = 5;
        rarr[1].height = 20;

        rarr[2] = new Rectangle();
        rarr[2].serialno = ++Rectangle.cnt;
        rarr[2].width = 15;
        rarr[2].height = 2;

        for(Rectangle r : rarr)
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
