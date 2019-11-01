package ch14;

import java.util.function.Function;

public class FunctionAndThenComposeExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Function<Member,Address> functionA;
        Function<Address,String> functionB;
        Function<Member,String> functionAB;
        String city;
        functionA = (m) -> m.getAddress();
        functionB = (b) -> b.getCity();
        functionAB =  functionA.andThen(functionB);
        
        city = functionAB.apply(new Member("ȫ�浿","hong", new Address("�ѱ�", "����")));
        System.out.println("���ֵ��� : " +  city);
        
        functionAB = functionB.compose(functionA);
        
        city = functionAB.apply(new Member("ȫ�浿","hong", new Address("�ѱ�", "����")));
        System.out.println("���ֵ��� : " +  city);
        
                
    }
    
}
