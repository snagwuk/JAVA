package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {1,6,3,5,8,7,6,8,7,3,5};
        int chkFlag = 0;                      // origin �� ��ġ�ϴ� ���ڰ� ����� üũ ���� (1�̸� ȥ��, 2�̸� ��)

        // ���� arr ��¹�
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)
        {
            chkFlag = 0;
            for(int x : arr)
            {
                if(arr[i] == x)
                    chkFlag++;
                if(chkFlag == 2)
                    break;
            }
            if(chkFlag == 1)
            {
                System.out.println("ȥ���� ���ڴ� " + arr[i] + "�Դϴ�.");
                break;
            }
        }



    }

}
