package ch11;

public class GcExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Employee emp;
        emp = new Employee(1); 
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);
        System.out.print("emp ������������ �����ϴ� �����ȣ : " );
        System.out.println(emp.eno);
        System.gc();
    }
}
class Employee
{
    int eno;
    Employee(int eno)
    {
        this.eno = eno;
        System.out.println("Employee(" + eno + ")�� �޸𸮿� ������");
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Employee(" + eno + ")�� �޸𸮿� ���ŵ�");
    }
}