package ch06;
class Circle2
{
    int r;
    int px;
    int py;
    int no;
    static int count;
    {
        no = ++count;
    }
    Circle2()
    {
        this(1,1,1);
    }
    Circle2(int r)
    {
        this(r,1,1);
    }
    Circle2(int r, int px, int py)
    {
        this.r = r;
        this.px = px;
        this.py = py;
    }

    double area()
    {
        return ((int)(Math.PI * r*r *100))/100.0 ;
    }
    double length()
    {
         return ((int)(Math.PI * r*2 *100))/100.0 ;
    }

    @Override
    public String toString()
    {
        return no + "번원=> 반지름 : " +r +"("+px+","+py+")"+"넓이 : "+area()+"둘레 : " + length();
    }
}
public class Circle2Ex1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(50);
        Circle2 c3 = new Circle2(100,10,20);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
