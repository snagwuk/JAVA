package ch13;

public class Member implements MsComp<Member>
{

    @Override
    public int compareTo(Member t)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

interface MsComp <T>
{
    int compareTo(T t);
}