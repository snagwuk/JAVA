package ch08;

public class PhoneExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //Phone phone = new Phone("aa");
        
        SmartPhone smartphone = new SmartPhone("홍길동");
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
        System.out.println("인터넷 검색을 합니다.");
    }
}