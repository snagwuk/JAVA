package ch08;

public class ImplemetationC implements InterFaceC
{

    @Override
    public void methodA()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC  methodA    ����");
    }

    @Override
    public void methodB()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC   methodB   ����");
    }

    @Override
    public void methodC()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC  methodC    ����");
    }
    
}
interface InterFaceC extends  InterFaceA, InterFaceB
{
    public void methodC();
}
interface InterFaceA
{
    public void methodA();
}
interface InterFaceB
{
    public void methodB();
}