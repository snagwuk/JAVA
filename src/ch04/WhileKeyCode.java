package ch04;

public class WhileKeyCode
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while(run)
        {
            if(keyCode!=13 && keyCode != 10)
            {
                System.out.println("�ѤѤѤѤѤѤѤѤѤ�");
                System.out.println("1.���� | 2.���� | 3.����");
                System.out.println("�ѤѤѤѤѤѤѤѤѤ�");
                System.out.print("���� : ");
            }

            keyCode = System.in.read();

            if (keyCode == 49)
            {
                speed++;
                System.out.println("����ӵ� : " + speed);
            }
            else if (keyCode == 50)
            {
                speed--;
                System.out.println("����ӵ� : " + speed);
            }
            else if (keyCode == 51)
            {
               run = false;
            }
        }
        System.out.println("�ý��� ����");
    }

}
