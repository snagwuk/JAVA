package ch08;

public class PhoneExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //Phone phone = new Phone("aa");
        
        SmartPhone smartphone = new SmartPhone("ȫ�浿");
        smartphone.turOn();
        smartphone.internetSearch();
        smartphone.turnOff();
        
    }
    
}
class SmartPhone extends Phone
{
    public SmartPhone(String owner)
    {
        super(owner);
    }
    public void internetSearch()
    {
        System.out.println("���ͳ� �˻��� �մϴ�.");
    }
}