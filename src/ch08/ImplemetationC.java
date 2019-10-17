package ch08;

public class ImplemetationC implements InterFaceC
{

    @Override
    public void methodA()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC  methodA    실행");
    }

    @Override
    public void methodB()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC   methodB   실행");
    }

    @Override
    public void methodC()
    {
        // TODO Auto-generated method stub
        System.out.println("ImplemetationC  methodC    실행");
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