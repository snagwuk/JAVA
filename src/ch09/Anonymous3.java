package ch09;

public class Anonymous3
{
    private int field;
    public void method(int arg1, int arg2)
    {
        int var1 = 0;
        int var2 = 0;
        field = 10;
        Calculatable calc = new Calculatable() 
                {

                    @Override
                    public int sum()
                    {
                        // TODO Auto-generated method stub
                        return field + arg1+arg2+var1+var2;
                    }
                    
                };
                System.out.println(calc.sum());
    }
}
interface Calculatable
{
    public int sum();
}