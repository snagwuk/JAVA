package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {7,6,3,5,8,1,6,8,7,3,5};
      //int[] arr = {7,6,3,5,8,1,6,8,7,3,5};

        int chkFlag = 0;                      // origin 과 일치하는 숫자가 몇개인지 체크 변수 (1이면 혼자, 2이면 쌍)

        // 현재 arr 출력문
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)
        {
            chkFlag = 0;                        // for문이 시작될때마다 초기화
            for(int x : arr)
            {
                if(arr[i] == x)                 // arr[i]와 arr배열의 모든수를 비교하여 같을경우 chkflag++
                    chkFlag++;
                if(chkFlag == 2)                // chkFlag가 2인경우 추가적인 반복문 방지하기 위한 break
                    break;
            }
            if(chkFlag == 1)                    // chkFlag가 1인경우는 배열에 한개의 숫자만 있는경우
            {
                System.out.println("혼자인 숫자는 " + arr[i] + "입니다.");
                break;
            }
        }



    }

}
