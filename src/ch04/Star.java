package ch04;

public class Star
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int n = 10;


        for (int i = 0; i < n ; i++)
        {
            for (int j = 0; j < n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤ�");

        for (int i = 0; i < n ; i++)
        {
            for (int j = 0; j < n ; j++)
            {
                if(j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }


        int x = 1;

        while(x != 1)
        {
            System.out.println("������������������");
            break;
        }

        do{
            System.out.println("dodododododo");
        } while(x != 1);
    }

}
