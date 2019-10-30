package ch12_Alesson;

public class MemoryBoxEx
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MemoryBox gc = new MemoryBox();
        gc.setDaemon(true);
        gc.start();
        int requireMemory = 0;
        for(int i = 0 ; i < 20 ; i++)
        {
            requireMemory = (int) (Math.random() *10) *20;
            if(gc.freeMemory() < requireMemory || gc.freeMemory() < gc.totalMemory() + 0.4)
                gc.interrupt();
            gc.usedMemory += requireMemory;
            System.out.println("usedMemory = " + gc.usedMemory);
        }
    }
    
}
class MemoryBox extends Thread
{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while(true)
        {
            try
            {
                Thread.sleep(1000*10);
            }
            catch (Exception e)
            {
                // TODO: handle exception
                System.out.println("Awaken by interrupt");
            }
            gc();
            System.out.println("Garvage collected.FreeMemory : " + freeMemory());
        }
    }
    private void gc()
    {
        // TODO Auto-generated method stub
        usedMemory -= 300;
        if(usedMemory < 0)
            usedMemory = 0;    
    }
    public double totalMemory()
    {
        // TODO Auto-generated method stub
        return MAX_MEMORY;
    }
    public int freeMemory()
    {
        // TODO Auto-generated method stub
        return MAX_MEMORY - usedMemory;
    }
}
