package ch11;

public class StringEx
{
    public static void main(String[] args)
    {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
        System.out.println(System.identityHashCode(s1) + " : " + s1.hashCode());
        System.out.println(System.identityHashCode(s2) + " : " + s2.hashCode());
        System.out.println(System.identityHashCode(s3) + " : " + s3.hashCode());
        System.out.println(System.identityHashCode(s4) + " : " + s4.hashCode());
        System.out.println();
        
        PersonZ p1 = new PersonZ("AAA");
        PersonZ p2 = new PersonZ("AAA");
        PersonZ p3 = new PersonZ("BBB");
        System.out.println(System.identityHashCode(p1) + " : " + p1.hashCode());
        System.out.println(System.identityHashCode(p2) + " : " + p2.hashCode());
        System.out.println(System.identityHashCode(p3) + " : " + p3.hashCode());
        System.out.println();
        
        PersonZZ pp1 = new PersonZZ("AAA");
        PersonZZ pp2 = new PersonZZ("AAA");
        PersonZZ pp3 = new PersonZZ("BBB");
        System.out.println(System.identityHashCode(pp1) + " : " + pp1.hashCode());
        System.out.println(System.identityHashCode(pp2) + " : " + pp2.hashCode());
        System.out.println(System.identityHashCode(pp3) + " : " + pp3.hashCode());
        System.out.println();
        
    }
}

class PersonZ
{
    String name;
    public PersonZ( String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
}
class PersonZZ
{
    String name;
    public PersonZZ( String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    public int hashCode()
    {
        return name.hashCode();
    }
}

