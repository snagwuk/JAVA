package ch14;

import java.util.function.UnaryOperator;

public class IdentityExam
{
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        UnaryOperator<MemberX> op = UnaryOperator.identity();
        MemberX m = op.apply(new MemberX("È«±æµ¿", "hong"));
        System.out.println("ÀÌ¸§ : " + m.getName());
        System.out.println("id : " + m.getId());
    }
    
}
class MemberX
{
    String name;
    String id;
    public MemberX(String name, String id)
    {
        super();
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
}

interface UnaryOperator<T>
{
    T apply(T t);
    static <T> UnaryOperator identity()
    {
        UnaryOperator u = (t) -> {
            return t;
        };
        
        return u;
    }
}