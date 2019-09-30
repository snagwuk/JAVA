package ch05;

public class SingleNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = {1,7,2,3,9,7,2,1,3};
        int saveIndex = 0;
        int result = 0 ;

        for(int x : arr)
            System.out.print(x + ",");
        System.out.println();

        for(int i = 0 ; i < arr.length; i++)
        {
            saveIndex = 0;
            int origin = arr[i];
            for(int x : arr)
            {
                if(origin == x)
                    saveIndex++;
                if(saveIndex == 2)
                    break;
            }
            if(saveIndex == 1)
            {
                result = origin;
                break;
            }
        }
        System.out.println("혼자인 숫자는 " + result + "입니다.");


    }

}
