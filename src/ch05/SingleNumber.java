package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        //�־��� �迭���� 1���� �Է��� ���� ã��

        int[] arr = {7,6,3,5,8,1,6,8,7,3,5};
      //int[] arr = {7,6,3,5,8,1,6,8,7,3,5}; 33,55,66,77,88 ,1

        int chkFlag = 0;                      // ������ �Ǵ� ���ڰ� �迭���� ����� üũ ���� (1�̸� ȥ��, 2�̸� ��)

        // ���� arr ��¹�
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)    // ������ �Ǵ� ���� �ε��� �ݺ���
        {
            chkFlag = 0;                        // ������ �Ǵ� ���ڰ� �ٲ𶧸��� chkFalg ���� 0���� �ʱ�ȭ

            for(int x : arr)                    // arr �迭 ��ü ���ϴ� for��
            {
                if(arr[i] == x)                 // arr[i]�� arr�迭�� ������ ���Ͽ� ������� chkflag++
                    chkFlag++;

                if(chkFlag == 2)                // chkFlag�� 2�ΰ�� �߰����� �ݺ��� �����ϱ� ���� break
                    break;
            }
            if(chkFlag == 1)                    // chkFlag�� 1�ΰ�� ��� ���ǹ�
            {
                System.out.println("ȥ���� ���ڴ� " + arr[i] + "�Դϴ�.");
                break;
            }
        }



    }

}
