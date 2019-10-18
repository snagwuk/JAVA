package ch09;

class Window
{
    Button button1 = new Button();
    Button button2 = new Button();
    
    Button.OnClickListener listener = new Button.OnClickListener()
    {
        
        @Override
        public void onClick()
        {
            // TODO Auto-generated method stub
            System.out.println("전화를 겁니다. Window");
            
        }
    };
    public Window()
    {
        // TODO Auto-generated constructor stub
        button1.setOnClickListener(listener);
        
        button2.setOnClickListener(new Button.OnClickListener() {
            
            @Override
            public void onClick()
            {
                // TODO Auto-generated method stub
                System.out.println("메세지를 보냅니다.Window");
                
            }
        });
    }
}
public class WindowExam
{
    public static void main(String[] args)
    {
        Window w= new Window();
        w.button1.touch();
        w.button2.touch();
    }
}
