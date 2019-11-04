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
            System.out.println("사전순으로 먼저옵니다.");
        else if ( order == 0)
            System.out.println("동일한 문자.");
        else 
            System.out.println("사전순으로 나중에 옵니다.");
    }
}
