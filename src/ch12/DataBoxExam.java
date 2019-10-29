package ch12;

public class DataBoxExam
{
    public static void main(String[] args)
    {
        DataBox databox = new DataBox();
        
        ProducerThread pt = new ProducerThread(databox);
        ConsumerThread ct = new ConsumerThread(databox);
        
        pt.start();
        ct.start();
    }
}
class DataBox
{
    private String data;

    public synchronized String getData()
    {
        if(this.data == null)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
            }
        }
        String returnValue = data;
       
        System.out.println("ConsummerThread�� ���� ������ : " + returnValue);
        data = null;
        notify();
        
        return returnValue;
    }

    public synchronized void setData(String data)
    {
        if(this.data != null)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
            }
        }
        this.data = data;
        System.out.println("ProducerThread�� ������ ������ : " + data);
        notify();
    }
    
}

class ConsumerThread extends Thread
{
    private DataBox databox;
    public ConsumerThread(DataBox databox)
    {
        // TODO Auto-generated constructor stub
        this.databox = databox;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
       for(int i = 1 ; i <=3; i++)
       {   
           String data = databox.getData();
       }
    }
}
class ProducerThread extends Thread
{
    private DataBox databox;
    public ProducerThread(DataBox databox)
    {
        // TODO Auto-generated constructor stub
        this.databox = databox;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for(int i = 1 ; i <=3; i++)
        {   
            String data = "Data-" + i;
            databox.setData(data);
        }
    }
}
