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
        return "구분 : " + type + ", 이름 : " + name + ", 부서 : " + dept;
    }
    
}
class FormalEmployee extends Employee
{
    String empno;
    FormalEmployee(String empno, String name, String dept)
    {
        super("정규직", name, dept);
        this.empno = empno;
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return super.toString() + ", 직원번호 : " + empno;
    }

    
    
}
class InFormalEmployee extends Employee
{
    String expireDate;
    InFormalEmployee(String name,  String expireDate)
    {
        super("비정규직", name, "");
        this.expireDate = expireDate;
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return super.toString() + ", 계약만료일 : " + expireDate;
    }
    
}
public class EmployeeExam
{
   
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
       FormalEmployee fe = new FormalEmployee("0001", "호일동","개발부");
       InFormalEmployee ife = new InFormalEmployee("홍길동", "20191231");
       System.out.println(fe+"\n"+ife);
        
    }
    
}
