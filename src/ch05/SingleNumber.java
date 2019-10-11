package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        //주어진 배열에서 1개만 입려된 숫자 찾기

        int[] arr = {7,6,3,5,8,1,6,8,7,3,5};
      //int[] arr = {7,6,3,5,8,1,6,8,7,3,5}; 33,55,66,77,88 ,1

        int chkFlag = 0;                      // 기준이 되는 숫자가 배열에서 몇개인지 체크 변수 (1이면 혼자, 2이면 쌍)

        // 현재 arr 출력문
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)    // 기준이 되는 숫자 인덱스 반복문
        {
            chkFlag = 0;                        // 기준이 되는 숫자가 바뀔때마다 chkFalg 변수 0으로 초기화

            for(int x : arr)                    // arr 배열 전체 비교하는 for문
            {
                if(arr[i] == x)                 // arr[i]와 arr배열의 모든수를 비교하여 같을경우 chkflag++
                    chkFlag++;

                if(chkFlag == 2)                // chkFlag가 2인경우 추가적인 반복문 방지하기 위한 break
                    break;
            }
            if(chkFlag == 1)                    // chkFlag가 1인경우 출력 조건문
            {
                System.out.println("혼자인 숫자는 " + arr[i] + "입니다.");
                break;
            }
        }



    }

}
