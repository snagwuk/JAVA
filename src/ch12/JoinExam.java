package ch12;
class SumThread extends Thread
{
    private long sum;

    public long getSum()
    {
        return sum;
    }

    public void setSum(long sum)
    {
        this.sum = sum;
    }
       @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 0 ; i <= 100; i++)
            sum +=i;
    }
}
public class JoinExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SumThread st = new SumThread();
        st.start();
        try
        {
            st.join();
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
        }
        System.out.println("1~100гу : " +st.getSum());
    }
    
}
