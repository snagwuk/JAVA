package ch09;

public class Anonymous2Exam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Anonymous2 anony = new Anonymous2();
        anony.field.turnOn();
        anony.method1();
        anony.method2(new RemoteControl() {
            
            @Override
            public void turnOn()
            {
                System.out.println("����ƮTv�� Ų��");
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void turnOff()
            {
                // TODO Auto-generated method stub
                System.out.println("����ƮTv�� ����");
            }
        });
    }
    
}
