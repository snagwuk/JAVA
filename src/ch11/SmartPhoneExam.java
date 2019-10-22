package ch11;

import java.util.Date;

public class SmartPhoneExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SmartPhone myPhone = new SmartPhone("구글","안드로이드");
        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone);
        System.out.println(new Object().toString());
        System.out.println(new Date().toString());
    }
    
}
class SmartPhone
{
    private String compnay;
    private String os;
    public SmartPhone(String compnay, String os)
    {
        // TODO Auto-generated constructor stub
        this.compnay=compnay;
        this.os=os;
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return compnay + ", "  +os;
    }
    
}
