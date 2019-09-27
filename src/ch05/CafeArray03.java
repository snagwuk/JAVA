package ch05;

public class CafeArray03
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 2x+1 =y
        int MAX = 10;
        char [][] arr = new char[30][30];

        for(int y = MAX; y >= 0; y--)
        {
            System.out.print(y==10? y+":": y+" :");
            for(int x = 0; x < 10; x++)
            {
                if( 2*x+1 == y)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        System.out.print("  :");
        for(int j = 0; j < 10; j++)
        {
            System.out.print(j);
        }
        System.out.println();

    }

}
