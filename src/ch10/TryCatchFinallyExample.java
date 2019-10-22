package ch10;

public class TryCatchFinallyExample
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] arr = {"10","2a"};
        int value = 0;
        for(int i =0; i <=2; i++)
        {
            try
            {
                value = Integer.parseInt(arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                // TODO: handle exception
                System.out.println("�ε����� �ʰ�����");
            }
            catch (NumberFormatException e)
            {
                // TODO: handle exception
                System.out.println("���ڷ� ��ȯ�� �� ����");
            }
            finally {
                System.out.println(value);
            }
            
        }
    }
    
}
