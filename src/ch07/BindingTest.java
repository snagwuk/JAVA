package ch07;

public class BindingTest        // ������ �������̵� ���� �ʴ´�.
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        parents p = new childs();
        childs c = new childs();
        
        System.out.println("p.x = " + p.x);
        p.method();
        
        System.out.println("�ѤѤѤѤѤѤѤѤѤ�");
        
        System.out.println("c.x = " + c.x);
        c.method();
        
        
    }
    
}
class parents
{
    int x = 100;        
    void method()
    {
        System.out.println("parents �޼ҵ�");
    }
}
class childs extends parents
{
    int x = 200;
    void method()
    {
        System.out.println("childs �޼ҵ�");
    }
}

