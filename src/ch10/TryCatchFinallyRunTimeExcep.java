package ch10;

public class TryCatchFinallyRunTimeExcep
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String data1 = null;
        String data2 = null;
        try
        {
            data1 = args[0]; 
            data2 = args[1]; 
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("����Ű�����  ���� �����մϴ� . \n [������]\n java TryCatchFinallyRunTimeExcep ��1 ��2");
            // TODO: handle exception
        }
        finally {
            System.out.println("�ٽý����غ�����");
            
        }
    }
    
}
