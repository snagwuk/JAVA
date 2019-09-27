package ch05;

public class ArrayEx12
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
      if(args.length ==0)
      {
          System.out.println("command에 파라미터를 입력하세요");
          return;

      }
      int num = Integer.parseInt(args[0]);
      System.out.print(num + "의 약수 : ");
      for(int i = 1 ; i<= num; i++)
      {
          if( num%i ==0)
          {
              System.out.print(i + " ");
          }
      }
      System.out.println();

    }

}
