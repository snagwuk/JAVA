package ch13;
class Generic<T>
{
    T[] v;

    public T[] getV()
    {
        return v;
    }

    public void setV(T[] v)
    {
        this.v = v;
    }
    void print()
    {
        for(T s : v)
            System.out.print(s+",");
        System.out.println();
    }
}
public class GenericExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Generic<String> t = new Generic<String>();
        String[] ss = {" 월매","춘향","향단"};
        t.setV(ss);
        t.print();
        for(String s : t.getV())
            System.out.println(s.trim());
        Integer[] ii = {10,20,30};
       Generic<Integer> t2 = new  Generic<Integer>();
       t2.setV(ii);
       t2.print();
       for(Integer s: t2.getV())
           System.out.println(s/10);
    }
    
}
