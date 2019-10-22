package ch11;
class Member
{
    String id;
    public Member(String string)
    {
        // TODO Auto-generated constructor stub
        id = string;
    }
    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        if( obj instanceof Member)
        {
            Member m = (Member) obj;
            if(id.equals(m.id))
                return true;
        }
        return false;
    }
    
}
public class MemberExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
       Member obj1 = new Member("blue");
       Member obj2 = new Member("blue");
       Member obj3 = new Member("red");
       
       if(obj1.equals(obj2))
           System.out.println("obj1 �� obj2�� �����մϴ�.");
       else
           System.out.println("obj1 �� obj2�� ���������ʽ��ϴ�.");
       
       if(obj1.equals(obj3))
           System.out.println("obj1 �� obj3�� �����մϴ�.");
       else
           System.out.println("obj1 �� obj3�� ���������ʽ��ϴ�.");
    }
    
}
