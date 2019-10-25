package ch11;

import java.util.Objects;

public class ToStringExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str1 = "홍길동";
        String str2 = null;
        MemberS m = new MemberS();
        System.out.println(Objects.toString(m));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2,"이름이없습니다."));
        System.out.println(Objects.toString(str1));
    }
    
}
class MemberS
{
    int n = 100;
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return n+"";
    }
}
