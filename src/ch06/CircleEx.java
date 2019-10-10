package ch06;
class Circle
{

    public  int r;
    public  int x;
    public  int y;
    public  int no;
    public static int count;
    double area()
    {
        return ((int)((Math.PI+0.005) * r*r *100))/100.0 ;
    }
    double length()
    {
         return ((int)(Math.PI * r*2 *100))/100.0 ;
    }

    @Override
    public String toString()
    {
        return no + "번 원=> 반지름 : " +r +"("+x+","+y+")"+"넓이 : "+area()+"둘레 : " + length();
    }

}
public class CircleEx
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Circle[] carr = new Circle[3];
        for(int i = 0; i < carr.length;i++)
        {
            carr[i] = new Circle();
            carr[i].r = i+1;
            carr[i].x = i;
            carr[i].y = i;
            carr[i].no = ++Circle.count;
            System.out.println(carr[i]);
        }

    }

}
