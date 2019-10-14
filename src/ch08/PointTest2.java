package ch08;
class Point3
{
    int x= 10;
    int y=20;
    Point3(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

}
class Point3D2 extends Point3
{
    int z=30;
    Point3D2(int x, int y, int z)
    {
        // TODO Auto-generated constructor stub
        super(x,y);
        this.z=z;
    }
    Point3D2()
    {
        this(100,200,300);
    }
}
public class PointTest2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x="+p3.x);
        System.out.println("p3.y="+p3.y);
        System.out.println("p3.z="+p3.z);
    }
    
}
