package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {1,7,2,3,9,7,2,1,3};        //기본 초기 배열 셋팅
        int saveIndex = 0;                      // origin 과 일치하는 숫자가 몇개인지 체크 (1이면 혼자, 2이면 쌍)
        int result = 0 ;

        // 현재 arr 출력문
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
                System.out.println("혼자인 숫자는 " + arr[i] + "입니다.");
                break;
            }
        }



    }

}
