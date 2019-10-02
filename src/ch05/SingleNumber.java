package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {1,6,3,5,8,7,6,8,7,3,5};
        int chkFlag = 0;                      // origin 과 일치하는 숫자가 몇개인지 체크 변수 (1이면 혼자, 2이면 쌍)

        // 현재 arr 출력문
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
                System.out.println("혼자인 숫자는 " + arr[i] + "입니다.");
                break;
            }
        }



    }

}
