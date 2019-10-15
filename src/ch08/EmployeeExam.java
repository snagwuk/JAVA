package ch08;

import javax.sound.midi.MidiDevice.Info;

class Employee
{
    String type,name,dept;
    Employee(String type, String name, String dept)
    {
        this.type = type;
        this.name = name;
        this.dept = dept;
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "���� : " + type + ", �̸� : " + name + ", �μ� : " + dept;
    }
    
}
class FormalEmployee extends Employee
{
    String empno;
    FormalEmployee(String empno, String name, String dept)
    {
        super("������", name, dept);
        this.empno = empno;
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return super.toString() + ", ������ȣ : " + empno;
    }

    
    
}
class InFormalEmployee extends Employee
{
    String expireDate;
    InFormalEmployee(String name,  String expireDate)
    {
        super("��������", name, "");
        this.expireDate = expireDate;
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return super.toString() + ", ��ุ���� : " + expireDate;
    }
    
}
public class EmployeeExam
{
   
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
       FormalEmployee fe = new FormalEmployee("0001", "ȣ�ϵ�","���ߺ�");
       InFormalEmployee ife = new InFormalEmployee("ȫ�浿", "20191231");
       System.out.println(fe+"\n"+ife);
        
    }
    
}
