package ch06;

public class Cars
{

   int gas;
   void setGas(int gas)
   {
       this.gas = gas;
   }
   public boolean isLeftGas()
   {
       if(gas==0)
       {
           System.out.println("Gas�� �����ϴ�.");
           return false;
       }
       System.out.println("Gas�� �ֽ��ϴ�.");
       return true;
   }
   void run()
   {
       while(true)
       {
           if(gas > 0)
           {
               System.out.println("�޸��ϴ�.(Gas�ܷ�:" + gas + ")");
               gas-=1;
           }
           else
           {
               System.out.println("����ϴ�.(Gas�ܷ�:" + gas + ")");
               return;
           }
       }
   }

}
