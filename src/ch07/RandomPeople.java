package ch07;

class Student
{
    String number;

    String name;

    String teamNum;
}

public class RandomPeople
{

    public static void main(String[] args)
    {

        String[][] data = { { "�����", "1" }, { "�輱ȣ", "2" }, { "������", "3" },
                { "������", "6" }, { "������", "4" }, { "������", "5" }, { "������", "1" },
                { "��ä��", "2" }, { "���Ѻ�", "1" }, { "�ڵ���", "1" }, { "�ڻ��", "3" },
                { "�����", "7" }, { "�۹���", "2" }, { "������", "2" }, { "�糪��", "3" },
                { "������", "7" }, { "���̶�", "7" }, { "�̳���", "6" }, { "�̿��", "5" },
                { "������", "6" }, { "������", "6" }, { "���ο�", "3" }, { "������", "7" },
                { "������", "4" }, { "������", "4" }, { "�ּ���", "7" }, { "����ȯ", "5" },
                { "���ָ�", "4" }, { "�Լ�ȣ", "1" }, { "Ȳ����", "5" } };

        // Student[] people = new Student[30];

        /*
         * for (int i = 0; i < 10000; i++) { int f = (int) (Math.random() *
         * data.length); int t = (int) (Math.random() * data.length); String
         * tmpName = data[f][0]; String tmpteam = data[f][1]; data[f][0] =
         * data[t][0]; data[f][1] = data[t][1]; data[t][0] = tmpName; data[t][1]
         * = tmpteam; } int flag; System.out.println("����ȣ/����\t1\t2\t3\t4\t5");
         * for(int i = 1; i <= 7; i++ ) { System.out.print(i+"�� \t"); for(int j
         * = 0; j < data.length; j++ ) { if
         * (data[j][1].equals(Integer.toString(i))) System.out.print(data[j][0]
         * + "\t"); } System.out.println(); }
         */
        String[][] teamdata =
            {
                { "�ڵ���" , "���Ѻ�" , "�����" , "�Լ�ȣ" , "������" },
                { "������" , "�۹���" , "�輱ȣ" , "��ä��" },
                { "�ڻ��" , "�糪��" , "������" , "���ο�" },
                { "������" , "���ָ�" , "������" , "������" },
                { "����ȯ" , "�̿��" , "Ȳ����" , "������" },
                { "������" , "������" , "�̳���" , "������" },
                { "�����" , "�ּ���" , "������" , "������" , "���̶�" }
                };

        System.out.println("����ȣ/����\t1\t2\t3\t4\t5");
        for (int z = 0; z < 7; z++)
        {

            System.out.print(z+1 +"��\t");
            for (int i = 0; i < 10000; i++)
            {
                int f = (int) (Math.random() * teamdata[z].length);
                int t =0;
                while(true)
                {
                    t = (int) (Math.random() * teamdata[z].length);
                    if(t!=f)
                        break;
                }
                String tmp = teamdata[z][f];
                teamdata[z][f] = teamdata[z][t];
                teamdata[z][t] = tmp;
            }

            for(int j = 0; j < teamdata[z].length ; j++ )
                System.out.print(teamdata[z][j]+"\t");
            System.out.println();
        }


    }
}
