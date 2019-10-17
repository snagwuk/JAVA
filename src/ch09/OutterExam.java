package ch09;

class OutterX
{
    String field = "Outter-field";
    void method()
    {
        System.out.println("Outter-method");
    }
    class Nested
    {
        String field = "Nested-field";
        void method()
        {
            System.out.println("Nested-method");
        }
        void print()
        {
            System.out.println(this.field);
            this.method();
            System.out.println(OutterX.this.field);
            OutterX.this.method();
        }
    }
}
public class OutterExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        OutterX outterX = new OutterX();
        OutterX.Nested nested = outterX.new Nested();
        nested.print();
    }
    
}
