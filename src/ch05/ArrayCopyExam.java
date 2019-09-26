package ch05;

public class ArrayCopyExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] oldArr = {"JAVA","ARRAY","COPY"};
        String[] newArr = new String[5];

        System.arraycopy(oldArr, 0, newArr, 1, oldArr.length);

        for(int i= 0; i<newArr.length;i++ )
        {
            System.out.print(newArr[i] +" ");
        }
    }

}
