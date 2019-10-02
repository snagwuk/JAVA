package ch05;

import java.util.Scanner;

public class SeatReservation
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        final int LINE = 5;
        int nameLength = 2;
        String[][] sheet = new String[LINE][2 * LINE];

        for (int i = 0; i < LINE; i++)
        {
            for (int j = 0; j < 2 * LINE; j++)
            {
                if (j < i || j > (2 * LINE) - 1 - i)
                    sheet[i][j] = "■"; // 0 = 좌석이 아닌 곳
                else
                    sheet[i][j] = "□"; // 1 = 빈좌석인곳
            }
        }


        Scanner sc = new Scanner(System.in);
        String input ="";
        while (!input.equals("99"))
        {
            System.out.printf("%2s  ", "좌석");
            for (int j = 0; j < 2 * LINE; j++)
                System.out.printf("%2s", j);

            System.out.println();
            for (int i = 0; i < LINE; i++)
            {
                System.out.printf("%c :", ('A' + i));
                for (int j = 0; j < 2 * LINE; j++)
                    System.out.printf("%"+nameLength+"s", sheet[i][j]);
                System.out.println();
            }

            System.out.println("예약자명,라인명,위치번호,인원수(종료:99)");
            System.out.print(">>");
            input = sc.next();
            if (input.equals("99"))
            {
                System.out.println("프로그램종료");
                break;
            }
            // String input = "상욱,C,4,3";
            //System.out.println(input);

            String[] inputs = new String[4];
            String tmp = "";
            int inputsIndex = 0;
            for (int i = 0; i < input.length(); i++)
            {
                if(inputsIndex == 4)
                    break;
                if (input.charAt(i) == ',')
                {
                    inputs[inputsIndex++] = tmp;
                    tmp = "";
                    continue;
                }
                else
                   tmp = tmp + input.charAt(i);

                if (i == input.length() - 1)
                    inputs[inputsIndex++] = tmp;
            }


            if(inputsIndex != 4)
            {   System.out.println("입력이 잘못 되었습니다.(많은인수) ex>>이름,A,3,4" );
                continue;
            }
            for(String x : inputs)
            {
                if(x == null)
                {
                    System.out.println("입력이 잘못 되었습니다. ex>>이름,A,3,4");
                    continue;
                }
            }

            int lineIndex = inputs[1].charAt(0) - 'A';

            if (inputs[1].charAt(0) < 'A' || inputs[1].charAt(0) > 'A'+LINE-1 )
            {
                System.out.println("잘못된 라인 입력입니다.");
                continue;
            }
            int sheetIndex = Integer.parseInt(inputs[2]);
            int peopelNum = Integer.parseInt(inputs[3]);

            if (sheet[lineIndex][sheetIndex].equals("■"))
            {
                System.out.println("좌석이 없는 곳입니다.");
            }
            else if (lineIndex < 0 || lineIndex >= LINE)
            {
                System.out.println("잘못된 라인명 입력입니다.");
            }
            else if (sheetIndex < 0 || sheetIndex >= 2 * LINE)
            {
                System.out.println("잘못된 시트위치번호 입력입니다.");
            }
            else if (peopelNum < 1 || peopelNum > 2 * LINE)
            {
                System.out.println("인원수 입력입니다.(1~10)");
            }
            else if (sheet[lineIndex][sheetIndex].equals("□"))
            {
                for (int z = 1; z < peopelNum; z++)
                {
                    if(sheetIndex + z > 10)

                    if (!sheet[lineIndex][sheetIndex + z].equals("□"))
                    {
                        System.out.println("지정한 인원수에 맞는 좌석이 아닙니다.");
                        break;
                    }
                }
                for (int z = 0; z < peopelNum; z++)
                    sheet[lineIndex][sheetIndex + z] = inputs[0];
            }
            else
                System.out.println("이미 예약된 좌석 입니다.");

            nameLength = inputs[0].length() > 2 ? inputs[0].length() : 2;
        }

    }

}
