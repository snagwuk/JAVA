package ch09;

public class Anonymous2
{
    RemoteControl field = new RemoteControl()
            {
        public void turnOn()
        {
            System.out.println("TV�� ŵ�ϴ�.");
        }
        public void turnOff()
        {
            System.out.println("TV�� ���ϴ�.");
        }
            };
            void method1()
            {
                RemoteControl localVar = new RemoteControl()
                        {
                            public void turnOn()
                            {
                                System.out.println("audio�� ŵ�ϴ�.");
                            }
                            public void turnOff()
                            {
                                System.out.println("audio�� ���ϴ�.");
                            }
                        };
                       localVar.turnOn();
            }
            void method2(RemoteControl rc)
            {
                rc.turnOn();
            }
}

interface RemoteControl 
{
    public void turnOn();
    public void turnOff();
}