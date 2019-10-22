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
                System.out.println("인덱스를 초과했음");
            }
            catch (NumberFormatException e)
            {
                // TODO: handle exception
                System.out.println("숫자로 변환할 수 없음");
            }
            finally {
                System.out.println(value);
            }
            
        }
    }
    
}
