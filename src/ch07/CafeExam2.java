package ch07;

abstract class Employee
{
    String type;
    String name;
    public Employee(String type , String name)
    {
        // TODO Auto-generated constructor stub
        this.type=type;
        this.name=name;
    }
    public Employee(String name)
    {
        // TODO Auto-generated constructor stub
        this.name=name;
    }
    
    abstract int getPay();
}
class FormalEmployee extends Employee
{
    String empNo;
    String position;
    int salary;
    
    public FormalEmployee(String name ,String empNo,int salary,    String position   )
    {
        super(name);
        this.type = "���������";
        this.empNo=empNo;
        this.position=position;
        this.salary=salary;
        // TODO Auto-generated constructor stub
    }

    @Override
    int getPay()
    {
        // TODO Auto-generated method stub
        return salary / 12;
    }
   
    
}
class InformalEmployee extends Employee
{
    
    String expireDate;
    int primaryPay;
    public InformalEmployee( String name, String expireDate,    int primaryPay)
    {
        super(name);
        this.type = "�����������";
        this.expireDate=expireDate;
        this.primaryPay=primaryPay;
        // TODO Auto-generated constructor stub
    }
    @Override
    int getPay()
    {
        // TODO Auto-generated method stub
        return primaryPay;
    }
    
}
class TempEmployee extends InformalEmployee
{

    int timePay;
    int empTime;
    public TempEmployee(String name, String expireDate,
            int primaryPay, int timePay,   int empTime)
    {
        super( name, expireDate, primaryPay);
        this.type = "�ӽ������";
        this.timePay=timePay;
        this.empTime=empTime;
        // TODO Auto-generated constructor stub
    }
    @Override
    int getPay()
    {
        // TODO Auto-generated method stub
        return super.getPay() + (timePay * empTime );
    }
    
}
class InternEmployee extends InformalEmployee
{
    float payRate;
    public InternEmployee( String name, String expireDate,
            int primaryPay, float payRate)
    {
        super(name, expireDate, primaryPay);
        this.type = "���ϻ��";
        this.payRate = payRate;
        // TODO Auto-generated constructor stub
    }
    @Override
    int getPay()
    {
        // TODO Auto-generated method stub
        return (int) (super.getPay() * payRate);
    }
    
}

public class CafeExam2
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Employee[] emps;
        emps = new Employee[4];
        emps[0] = new FormalEmployee("������", "1", 5000, "����");
        emps[1] = new InformalEmployee("�̺���", "20191231", 1000);
        emps[2] = new TempEmployee("���ӽ�", "20191231", 0,1,50);
        emps[3] = new InternEmployee("������", "20191231", 2000, 0.8f);
        for(Employee e : emps)
        {
            System.out.println(e.type + "��� : " + e.name + "�� �޿� : " + e.getPay());
        }
        
    }
    
}
