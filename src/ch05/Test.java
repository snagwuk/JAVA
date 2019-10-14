package ch05;

class Tt
{
    static int x = 10;
}
public class Test
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
     /*   System.out.print("ют╥б :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        boolean result = false;
        int sum = 0;

        while(n != 0)
        {
            sum += n%10;
            n /= 10;
        }
        if( num % sum == 0)
            result = true;
        else
            result = false;

        System.out.println(result);*/

        System.out.println(Tt.x);
        Tt.x = 20;
        String x="ABC";
        x.length();
        x.charAt(0);
        System.out.println(Tt.x);

        String[] s = new String[4];
        //s[1].equals(anObject)
        System.out.println(s[0]);
        System.out.printf("%c\n",'A'+5);
        
        String y="ABC";
        System.out.println(y.charAt(0));
        System.out.println(y.charAt(1));
        System.out.println(y.charAt(2));
        









    }

}
