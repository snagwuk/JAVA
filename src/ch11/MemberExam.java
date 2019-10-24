package ch11;
class MemberZ
{
    String id;
    public MemberZ(String string)
    {
        // TODO Auto-generated constructor stub
        id = string;
    }
    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        if( obj instanceof MemberZ)
        {
            MemberZ m = (MemberZ) obj;
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
       MemberZ obj1 = new MemberZ("blue");
       MemberZ obj2 = new MemberZ("blue");
       MemberZ obj3 = new MemberZ("red");
       
       if(obj1.equals(obj2))
           System.out.println("obj1 과 obj2는 동등합니다.");
       else
           System.out.println("obj1 과 obj2는 동등하지않습니다.");
       
       if(obj1.equals(obj3))
           System.out.println("obj1 과 obj3는 동등합니다.");
       else
           System.out.println("obj1 과 obj3는 동등하지않습니다.");
    }
    
}
