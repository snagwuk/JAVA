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
        System.out.print("emp 가최종적으로 참조하는 사원번호 : " );
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
        System.out.println("Employee(" + eno + ")가 메모리에 생성됨");
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Employee(" + eno + ")가 메모리에 제거됨");
    }
}