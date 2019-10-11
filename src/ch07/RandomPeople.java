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

        String[][] data = { { "길재우", "1" }, { "김선호", "2" }, { "김유리", "3" },
                { "김유림", "6" }, { "김은솔", "4" }, { "김자윤", "5" }, { "김지은", "1" },
                { "김채윤", "2" }, { "남한별", "1" }, { "박동진", "1" }, { "박상욱", "3" },
                { "서대원", "7" }, { "송민주", "2" }, { "송진훈", "2" }, { "양나윤", "3" },
                { "엄성식", "7" }, { "윤이랑", "7" }, { "이나은", "6" }, { "이우빈", "5" },
                { "이정진", "6" }, { "이주현", "6" }, { "정민우", "3" }, { "조유경", "7" },
                { "주진희", "4" }, { "지성범", "4" }, { "최세희", "7" }, { "최정환", "5" },
                { "최주리", "4" }, { "함석호", "1" }, { "황지영", "5" } };

        // Student[] people = new Student[30];

        /*
         * for (int i = 0; i < 10000; i++) { int f = (int) (Math.random() *
         * data.length); int t = (int) (Math.random() * data.length); String
         * tmpName = data[f][0]; String tmpteam = data[f][1]; data[f][0] =
         * data[t][0]; data[f][1] = data[t][1]; data[t][0] = tmpName; data[t][1]
         * = tmpteam; } int flag; System.out.println("조번호/순위\t1\t2\t3\t4\t5");
         * for(int i = 1; i <= 7; i++ ) { System.out.print(i+"조 \t"); for(int j
         * = 0; j < data.length; j++ ) { if
         * (data[j][1].equals(Integer.toString(i))) System.out.print(data[j][0]
         * + "\t"); } System.out.println(); }
         */
        String[][] teamdata =
            {
                { "박동진" , "남한별" , "길재우" , "함석호" , "김지은" },
                { "송진훈" , "송민주" , "김선호" , "김채윤" },
                { "박상욱" , "양나윤" , "김유리" , "정민우" },
                { "지성범" , "최주리" , "김은솔" , "주진희" },
                { "최정환" , "이우빈" , "황지영" , "김자윤" },
                { "김유림" , "이주현" , "이나은" , "이정진" },
                { "서대원" , "최세희" , "엄성식" , "조유경" , "윤이랑" }
                };

        System.out.println("조번호/순위\t1\t2\t3\t4\t5");
        for (int z = 0; z < 7; z++)
        {

            System.out.print(z+1 +"조\t");
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
