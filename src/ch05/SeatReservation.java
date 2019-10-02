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
                    sheet[i][j] = "��"; // 0 = �¼��� �ƴ� ��
                else
                    sheet[i][j] = "��"; // 1 = ���¼��ΰ�
            }
        }


        Scanner sc = new Scanner(System.in);
        String input ="";
        while (!input.equals("99"))
        {
            System.out.printf("%2s  ", "�¼�");
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

            System.out.println("�����ڸ�,���θ�,��ġ��ȣ,�ο���(����:99)");
            System.out.print(">>");
            input = sc.next();
            if (input.equals("99"))
            {
                System.out.println("���α׷�����");
                break;
            }
            // String input = "���,C,4,3";
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
            {   System.out.println("�Է��� �߸� �Ǿ����ϴ�.(�����μ�) ex>>�̸�,A,3,4" );
                continue;
            }
            for(String x : inputs)
            {
                if(x == null)
                {
                    System.out.println("�Է��� �߸� �Ǿ����ϴ�. ex>>�̸�,A,3,4");
                    continue;
                }
            }

            int lineIndex = inputs[1].charAt(0) - 'A';

            if (inputs[1].charAt(0) < 'A' || inputs[1].charAt(0) > 'A'+LINE-1 )
            {
                System.out.println("�߸��� ���� �Է��Դϴ�.");
                continue;
            }
            int sheetIndex = Integer.parseInt(inputs[2]);
            int peopelNum = Integer.parseInt(inputs[3]);

            if (sheet[lineIndex][sheetIndex].equals("��"))
            {
                System.out.println("�¼��� ���� ���Դϴ�.");
            }
            else if (lineIndex < 0 || lineIndex >= LINE)
            {
                System.out.println("�߸��� ���θ� �Է��Դϴ�.");
            }
            else if (sheetIndex < 0 || sheetIndex >= 2 * LINE)
            {
                System.out.println("�߸��� ��Ʈ��ġ��ȣ �Է��Դϴ�.");
            }
            else if (peopelNum < 1 || peopelNum > 2 * LINE)
            {
                System.out.println("�ο��� �Է��Դϴ�.(1~10)");
            }
            else if (sheet[lineIndex][sheetIndex].equals("��"))
            {
                for (int z = 1; z < peopelNum; z++)
                {
                    if(sheetIndex + z > 10)

                    if (!sheet[lineIndex][sheetIndex + z].equals("��"))
                    {
                        System.out.println("������ �ο����� �´� �¼��� �ƴմϴ�.");
                        break;
                    }
                }
                for (int z = 0; z < peopelNum; z++)
                    sheet[lineIndex][sheetIndex + z] = inputs[0];
            }
            else
                System.out.println("�̹� ����� �¼� �Դϴ�.");

            nameLength = inputs[0].length() > 2 ? inputs[0].length() : 2;
        }

    }

}
