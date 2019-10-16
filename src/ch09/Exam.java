package ch09;

public class Exam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ImplemetationC impl = new ImplemetationC();
        
        InterFaceA ia = impl;
        ia.methodA();
        
        System.out.println();
        
        InterFaceB ib = impl;
        ib.methodB();
        System.out.println();
        
        InterFaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();
        
    }
    
}
