package ch12;

class Calculator 
{
    private int memory;

    public int getMemory()
    {
        return memory;
    }

    public synchronized void setMemory(int memory)
    {
        this.memory = memory;
        try
        {
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}
class User1 extends Thread
{
    private Calculator calculator;
    void setCalculator(Calculator calculator)
    {
        this.setName("User1");
        this.calculator = calculator;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        calculator.setMemory(100);
    }
}
class User2 extends Thread
{
    private Calculator calculator;
    void setCalculator(Calculator calculator)
    {
        this.setName("User2");
        this.calculator = calculator;
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        calculator.setMemory(50);
    }
}

public class CalculatorExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Calculator calculator = new Calculator();
        
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();
        
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
       
        
        
    }
    
}
