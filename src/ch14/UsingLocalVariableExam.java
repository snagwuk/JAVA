package ch14;

public class UsingLocalVariableExam
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        UsingLocalVariable u = new UsingLocalVariable();
        u.method(20);
    }
    
}
class UsingLocalVariable
{
    void method(int arg)        //arg�� final Ư��������
    {
        int localVar = 40; //final Ư��������
        
        MyFunctionalInterface fi  =() -> 
        {
            System.out.println("args : " + arg);
            System.out.println("localVar : " + localVar + "\n");

        };
        fi.method();
        
        
    }
}