package ch08;

public class RemoteControlExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        RemoteControl rc;
        rc = new Tv();
        rc.turnOn();
        rc.turnOff();
        rc= new Audio();
        rc.turnOn();
        rc.turnOff();
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤ�");
        rc = new RemoteControl()
                {

                    @Override
                    public void turnOn()
                    {
                        // TODO Auto-generated method stub
                        System.out.println("�ѤѤ�turnOn");
                    }

                    @Override
                    public void turnOff()
                    {
                        // TODO Auto-generated method stub
                        System.out.println("�ѤѤ�turnOff");
                    }

                    @Override
                    public void setVolume(int volume)
                    {
                        // TODO Auto-generated method stub
                        System.out.println("�ѤѤ�setVolume");
                    }
                };
        rc.turnOn();
        rc.turnOff();
            
    }
    
}
