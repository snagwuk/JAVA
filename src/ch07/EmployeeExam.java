package ch07;


class EmployeeX
{
    String type,name,dept;
    EmployeeX(String type, String name, String dept)
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
class FormalEmployeeX extends EmployeeX
{
    String empno;
    FormalEmployeeX(String empno, String name, String dept)
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
class InFormalEmployeeX extends EmployeeX
{
    String expireDate;
    InFormalEmployeeX(String name,  String expireDate)
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
        FormalEmployeeX fe = new FormalEmployeeX("0001", "호일동","개발부");
       InFormalEmployeeX ife = new InFormalEmployeeX("홍길동", "20191231");
       System.out.println(fe+"\n"+ife);
        
    }
    
}
