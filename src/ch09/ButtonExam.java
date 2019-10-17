package ch09;

public class ButtonExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
        
        
    }
}
class CallListener implements Button.OnClickListener
{

    @Override
    public void onClick()
    {
        // TODO Auto-generated method stub
        System.out.println("전화를 겁니다.");
    }
    
}
class MessageListener implements Button.OnClickListener
{

    @Override
    public void onClick()
    {
        // TODO Auto-generated method stub
        System.out.println("메시지를 보냅니다.");
    }
    
}

