package ch09;

public class Anonymous2
{
    RemoteControl field = new RemoteControl()
            {
        public void turnOn()
        {
            System.out.println("TV¸¦ Åµ´Ï´Ù.");
        }
        public void turnOff()
        {
            System.out.println("TV¸¦ ²ü´Ï´Ù.");
        }
            };
            void method1()
            {
                RemoteControl localVar = new RemoteControl()
                        {
                            public void turnOn()
                            {
                                System.out.println("audio¸¦ Åµ´Ï´Ù.");
                            }
                            public void turnOff()
                            {
                                System.out.println("audio¸¦ ²ü´Ï´Ù.");
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