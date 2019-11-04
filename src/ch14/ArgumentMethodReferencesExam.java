package ch14;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExam
{
    public static void main(String[] args)
    {
        ToIntBiFunction<String, String> function;
        
        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));
        
        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA8"));
    }

    private static void print(int order)
    {
        // TODO Auto-generated method stub
        if (order < 0 )
            System.out.println("���������� �����ɴϴ�.");
        else if ( order == 0)
            System.out.println("������ ����.");
        else 
            System.out.println("���������� ���߿� �ɴϴ�.");
    }
}
