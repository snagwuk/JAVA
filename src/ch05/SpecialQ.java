package ch05;

public class SpecialQ
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        char[][] arr = { { 'U', 'R', 'L', 'P', 'M' },
                { 'X', 'P', 'R', 'E', 'T' }, { 'G', 'I', 'A', 'E', 'T' },
                { 'X', 'T', 'N', 'Z', 'Y' }, { 'X', 'O', 'Q', 'R', 'S' } };
        String[] wordArr = { "REPEAT", "GIRL", "PRETTY", "KARA", "PANDORA",
                "GIAZAPX", "ITNB" };
        boolean[] flagArr = new boolean[wordArr.length];

        int px = 0;
        int py = 0;

        int px2 = 0;
        int py2 = 0;

        boolean firstChk = false;

        String word = "REPEAT";

        for (int t = 0; t < word.length(); t++)
        {

            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length; j++)
                {
                    if (word.charAt(t) == arr[i][j])
                    {
                        px = i;
                        py = j;

                        for (int x = px - 1; x <= px + 1; x++)
                        {
                            for (int y = py - 1; y <= py + 1; y++)
                            {
                                if (t+1 != word.length())
                                {
                                    if (word.charAt(t+1) == arr[i][j])
                                    {
                                        firstChk = true;
                                        px = i;
                                        py = j;
                                    }
                                    else
                                    {
                                        firstChk = false;
                                        break;

                                    }

                                }


                                //System.out.print(arr[i][j] + " ");
                            }
                            //System.out.println();
                        }
                    }
                    else
                        firstChk = false;

                }
            }

        }

        System.out.println(firstChk);

       /* int x = 2, y = 1;

        for (int i = x - 1; i <= x + 1; i++)
        {
            for (int j = y - 1; j <= y + 1; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        for (

                int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (

                int j = 0; j < arr.length; j++)
        {
            System.out.println(wordArr[j] + " = " + flagArr[j]);
        }

    }

}
