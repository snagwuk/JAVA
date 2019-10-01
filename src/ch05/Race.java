package ch05;

public class Race
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        String[] starter = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","mislav","ana"};

        for(String x : completion)
        {
            for(int i = 0; i <starter.length;i++)
            {
                if(starter[i].equals(x))
                {
                    starter[i] = "retire";
                    break;
                }
            }
        }
        for(String y : starter)
        {
            if(!y.equals("retire"))
                System.out.println("완주 못한 사람 = " + y);
        }

    }

}
