package ch06;

public class SingletonExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2)
            System.out.println("���� singleton ��ü�Դϴ�.");
        else
            System.out.println("�ٸ� singleton ��ü�Դϴ�.");
    }

}
