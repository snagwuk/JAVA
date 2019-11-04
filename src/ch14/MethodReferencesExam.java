package ch14;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        IntBinaryOperator op;
        op = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("결과1 : " + op.applyAsInt(1, 2));
        
        op = Calculator:: staticMethod;
        System.out.println("결과2 : " + op.applyAsInt(3, 4));
        
        Calculator c = new Calculator();
        op = (x,y) -> c.instanceMethod(x,y);
        System.out.println("결과3 : " + op.applyAsInt(5, 6));
        
        
        op = c::instanceMethod;
        System.out.println("결과4 : " + op.applyAsInt(7, 8));
    }
    
}

class Calculator
{
    static int staticMethod(int x, int y)
    {
        return x+y;
    }
    int instanceMethod(int x, int y)
    {
        return x+y;
    }
}