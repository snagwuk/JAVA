package ch18;

import java.io.InputStream;

public class SystemInExam
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("==�޴�==");
        System.out.println("1. ���� ��ȸ");
        System.out.println("2. ���� ���");
        System.out.println("3. ���� �Ա�");
        System.out.println("4. ���� �ϱ�");
        System.out.println("�޴��� �����ϼ���: ");
        
      
        
        while(true)
            {
            InputStream is = System.in;
        char inputChar = (char) is.read();
        System.out.println((int)inputChar);
        switch (inputChar)
        {
            case '1':
                System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
                break;
            
            case '2':
                System.out.println("���� ����� �����ϼ̽��ϴ�.");
                break;
            
            case '3':
                System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
                break;
            
            case '4':
                System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
                break;
        }
            }
    }
    
}