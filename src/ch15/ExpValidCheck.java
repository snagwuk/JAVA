package ch15;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck
{
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String line = "(()())))";
        Stack st = new Stack();
        String expression = line;
        System.out.println("expression : " + expression );
        
        try
        {
            for(int i = 0 ; i < expression.length() ; i++)
            {
                char ch = expression.charAt(i);
                
                if(ch =='(')
                    st.push(ch+"");
                else if (ch ==')')
                    st.pop();
            }
            if(st.isEmpty())
                System.out.println("��ȣ�� ��ġ�մϴ�.");
            else
                System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
        }
        catch (EmptyStackException e)
        {
            System.out.println("2222��ȣ�� ��ġ���� �ʽ��ϴ�");
            // TODO: handle exception
        }
    }
    
}
