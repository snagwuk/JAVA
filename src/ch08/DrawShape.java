package ch08;
class Shape
{
    String color = "black";
    void draw()
    {
        System.out.printf("[color=%s]\n",color);
    }
}
class Point
{
    int x;
    int y;
     Point(int i, int j)
    {
        x = i;
        y = j;
    }
    Point()
    {
        this(0,0);
    }
    String getXY()
    {
        return "(" + x + "," + y + ")";
                
    }
    
}
class Triangle extends Shape
{
    Point[] p = new Point[3];
    public Triangle(Point[] p)
    {
        this.p = p;
    }
    

    public void draw()
    {
        // TODO Auto-generated method stub
        System.out.printf("[p1=%s, p2=%s, p3 =%s,color = %s]\n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
        
    }
    
}
class Circle extends Shape
{
    Point center;
    int r;
    Circle(Point point, int i)
    {
        // TODO Auto-generated constructor stub
        center = point;
        r = i;
    }
    Circle()
    {
        this(new Point(0,0),100);
    }
    @Override
    void draw()
    {
        // TODO Auto-generated method stub
       System.out.printf("[center = (%d , %d) , color = %s]\n",center.x,center.y,color);
       
    }
    
}

public class DrawShape
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Point[] p = {
                new Point(100,200) ,   new Point(150,200) ,  new Point(300,250) 
        };
        
        
        Triangle t = new Triangle(p);
        
        Circle c = new Circle(new Point(150,150),50);
        
        t.draw();
        c.draw();
        
    }
    
}
