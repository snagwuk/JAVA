package ch05;

public class Race
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        String[] starter = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","mislav","ana"};
        String chckFlag = "RETIRE";

        for(String x : completion)
        {
            for(int i = 0; i <starter.length;i++)
            {
                if(starter[i].equals(x))
                {
                    starter[i] = chckFlag;
                    break;
                }
            }
        }

        System.out.print("완주 못한 사람 = ");
        for(String y : starter)
        {
            if(!y.equals(chckFlag))
                System.out.print(y + " ");
        }
        System.out.println();

    }

}
