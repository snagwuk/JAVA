package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {1,7,2,3,9,7,2,1,3};        //�⺻ �ʱ� �迭 ����
        int saveIndex = 0;                      // origin �� ��ġ�ϴ� ���ڰ� ����� üũ (1�̸� ȥ��, 2�̸� ��)
        int result = 0 ;

        // ���� arr ��¹�
        for(int x : arr)
            System.out.print(x + ",");
        System.out.println();


        for(int i = 0 ; i < arr.length; i++)
        {
            saveIndex = 0;
            for(int x : arr)
            {
                if(arr[i] == x)
                    saveIndex++;
                if(saveIndex == 2)
                    break;
            }
            if(saveIndex == 1)
            {
                System.out.println("ȥ���� ���ڴ� " + arr[i] + "�Դϴ�.");
                break;
            }
        }



    }

}
