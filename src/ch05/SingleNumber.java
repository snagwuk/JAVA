package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {7,6,3,5,8,1,6,8,7,3,5};
      //int[] arr = {7,6,3,5,8,1,6,8,7,3,5};

        int chkFlag = 0;                      // origin �� ��ġ�ϴ� ���ڰ� ����� üũ ���� (1�̸� ȥ��, 2�̸� ��)

        // ���� arr ��¹�
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)
        {
            chkFlag = 0;                        // for���� ���۵ɶ����� �ʱ�ȭ
            for(int x : arr)
            {
                if(arr[i] == x)                 // arr[i]�� arr�迭�� ������ ���Ͽ� ������� chkflag++
                    chkFlag++;
                if(chkFlag == 2)                // chkFlag�� 2�ΰ�� �߰����� �ݺ��� �����ϱ� ���� break
                    break;
            }
            if(chkFlag == 1)                    // chkFlag�� 1�ΰ��� �迭�� �Ѱ��� ���ڸ� �ִ°��
            {
                System.out.println("ȥ���� ���ڴ� " + arr[i] + "�Դϴ�.");
                break;
            }
        }



    }

}
