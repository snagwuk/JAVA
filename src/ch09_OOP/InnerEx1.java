package ch09_OOP;

public class InnerEx1
{
    class InstanceInner
    {
    }
    static class StacticInner
    { 
    }
    
    InstanceInner iv = new InstanceInner();
    static StacticInner cv = new StacticInner();
    
    static void staticMethod()
    {
        //InstanceInner obj1 = new InstanceInner();
        StacticInner obj2 = new StacticInner();
        
        InnerEx1 outer = new InnerEx1();
        InstanceInner obj11 = outer.new InstanceInner();
    }
    
    void instanceMethod()
    {
        InstanceInner obj1 = new InstanceInner();
        StacticInner obj2 = new StacticInner();
        //LocalInner iv = new LocalInner();
    }
    void myMethod()
    {
        class LocalInner
        {
            
        }
        LocalInner iv = new LocalInner();
    }
}
