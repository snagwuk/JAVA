package ch05;

public class ArrayEx12
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
      if(args.length ==0)
      {
          System.out.println("command�� �Ķ���͸� �Է��ϼ���");
          return;

      }
      int num = Integer.parseInt(args[0]);
      System.out.print(num + "�� ��� : ");
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
