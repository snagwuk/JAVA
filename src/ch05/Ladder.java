package ch05;

public class Ladder
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] start = {"A","B","C","D","E","F","G"};
        String[] end = new String[start.length];
        final int ENTRY = start.length;
        final int ROW = 7 +2 ;
        final int COL = ENTRY*2+1;      //11

        int[][] ladder = new int[ROW][COL];

        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                if(j%2 == 1)
                    ladder[i][j] = 1;
                else
                    ladder[i][j] = 0;
            }
        }

        for (int i = 1; i < ROW-1; i++)
        {
            for (int j = 2; j < COL-1; j=j+2)
            {
                if(ladder[i][j-2] != 1 && ladder[i][j-1] != 8)   // 0이면 랜덤값 생성
                {
                    ladder[i][j] = (int)(Math.random()*2);
                    if(ladder[i][j] == 1)
                        ladder[i][j+2] = 8;
                }
            }
        }
    /*    for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                System.out.printf("%2s ",ladder[i][j]);
            }
            System.out.println();
        }

        System.out.println();*/



        //사다리 랜덤 생성 부분
        /*int[][] ladder = {
                {0,1,0,1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,0,1,0},
                {0,1,1,1,0,1,1,1,0,1,0},
                {0,1,0,1,1,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,1,1,0},
                {0,1,0,1,1,1,0,1,0,1,0},
                {0,1,1,1,0,1,1,1,0,1,0},
                {0,1,0,1,0,1,0,1,1,1,0},
                {0,1,0,1,0,1,0,1,0,1,0}
        };         */     // [9][11]


        for (int i = 1; i < COL; i++)
        {   if(i%2 == 0)
                System.out.printf("%2s","  ");
            else
                System.out.printf("%2c",(i+1)/2-1+'A');
        }
        System.out.println();
        for (int i = 1; i < ROW; i++)
        {
            for (int j = 1; j < COL; j++)
            {
                if(ladder[i][j] == 1 && j%2==1)
                {
                    if(ladder[i][j+1] == 1 && j+1 < COL)
                        System.out.printf("%2s","├");
                    else if(ladder[i][j-1] == 1)
                        System.out.printf("%2s","─┤");
                    else if(ladder[i][j] == 1 && j%2==1)
                        System.out.printf("%2s","│");
                }
                else if(ladder[i][j] == 1 && j%2==0)
                    System.out.printf("%2s","──");
                else if(ladder[i][j] == 0 || ladder[i][j] == 8 )
                    System.out.printf("%2s"," ");
            }
            System.out.println();
        }

        for(int z = 0; z < start.length; z++)
        {
            int pj = 1+(2*z);
            for (int i = 0; i < ROW; i++)
            {
                if(ladder[i][pj+1] == 1)
                    pj +=2;
                else if(ladder[i][pj-1] == 1)
                    pj -=2;
                else
                    continue;
            }

            end[(pj-1)/2] = start[z];
        }

        for (int i = 1; i < COL; i++)
        {
            if(i%2 == 0)
                System.out.printf("%2s","  ");
            else
                System.out.printf("%2S",end[(i-1)/2]);
        }

    }

}
