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
        return "���� : " + type + ", �̸� : " + name + ", �μ� : " + dept;
    }
    
}
class FormalEmployeeX extends EmployeeX
{
    String empno;
    FormalEmployeeX(String empno, String name, String dept)
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
class InFormalEmployeeX extends EmployeeX
{
    String expireDate;
    InFormalEmployeeX(String name,  String expireDate)
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
        FormalEmployeeX fe = new FormalEmployeeX("0001", "ȣ�ϵ�","���ߺ�");
       InFormalEmployeeX ife = new InFormalEmployeeX("ȫ�浿", "20191231");
       System.out.println(fe+"\n"+ife);
        
    }
    
}
