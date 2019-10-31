package ch13;
class Gen1
{
    String name="Gen1";
    String getMsg() {return name;}
}
class Gen2 extends Gen1
{
    String name="Gen2";
    String getMsg() {return name;}
}
class Gen3 extends Gen2
{
    String name="Gen3";
    String getMsg() {return name;}
}
class Generic3<T>
{
    T v; 
    public Generic3(T n)
    {
        // TODO Auto-generated constructor stub
        v= n;
    }
    public T getV()
    {
        return v;
    }
    public void setV(T v)
    {
        this.v = v;
    }
}
public class GenericExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Gen3 g3 = new Gen3();
        Generic3<? super Gen2> g2 = new Generic3<Gen1>(g3);
        Object t1 = g2.getV();
        Gen1 t2 = (Gen3)g2.getV();
        System.out.println(t2.name);
        System.out.println(t2.getMsg());
        Generic3<? extends Gen2> g5 = new Generic3<Gen2>(new Gen2());
        Generic3<Gen2> g51 = new Generic3<Gen2>(new Gen2());
        Generic3<?> g6 = new Generic3<Gen3>(g3);
        Object t5 = g6.getV();
        Gen3 t6 = (Gen3)g6.getV();
        Generic3<?> g7 = new Generic3<Integer>(1);
    }
    
}
