package ch08;
interface Movable
{
    int MAX = 100;
    void move(int x, int y);
}
interface Attackable 
{
    void attack(Unit u);
}
interface Fightable extends Movable,Attackable{}
class Unit 
{
    int currentHp,x,y;
}
class Fighter extends Unit implements Fightable
{

    @Override
    public void move(int x, int y)
    {
        // TODO Auto-generated method stub
        System.out.println(x +" , " + y + "��ǥ�� �̵�");
    }

    @Override
    public void attack(Unit u)
    {
        // TODO Auto-generated method stub
        System.out.println(u + "�ο���");
    }
    
}

public class InterFaceTest3
{
    
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Fighter f = new Fighter();
        System.out.println(f.MAX);
        f.move(10, 20);
        f.attack(f);
        System.out.println(f.currentHp);
        Fightable fa = f;
        System.out.println(fa.MAX);
        fa.attack(f);
        fa.move(20, 30);
        //System.out.println(fa.currentHp);
        if(f instanceof Fighter)
            System.out.println("f�� �����ϴ� ��ü��  Fighter��ü��.");
        if(fa instanceof Unit)
        {
            System.out.println("f�� �����ϴ� ��ü��  Unit��ü��.");
            Unit u  = f;
            System.out.println("u ���������� ���� ������ ����� Object����� �����ϸ� 3����");
            System.out.println(u.currentHp + ","+u.x+","+u.y);
        }
        if(f instanceof Fightable)
        {   
            System.out.println("f�� �����ϴ� ��ü��  Fightable��ü��.");
            Fightable fa2 = (Fightable)f;
            System.out.println("fa2 ���������� ���� ������ ����� Object����� �����ϸ� 3����");
            System.out.println(fa2.MAX);
            fa2.attack(f);
            fa.move(30, 40);
        }
        if(f instanceof Movable)
        {   
            System.out.println("f�� �����ϴ� ��ü��  Movable��ü��.");
            Movable m = (Movable)f;
            System.out.println("m ���������� ���� ������ ����� Object����� �����ϸ� 2����");
            System.out.println(m.MAX);
            fa.move(30, 40);
        }
        if(f instanceof Attackable)
        {   
            System.out.println("f�� �����ϴ� ��ü��  Attackable��ü��.");
            Attackable a = (Attackable)f;
            System.out.println("m ���������� ���� ������ ����� Object����� �����ϸ� 1����");

            a.attack(f);
        }
        if(f instanceof Object)
        {
            System.out.println("f�� �����ϴ� ��ü��  Object��ü��.");
            Object o = (Object)f;
            System.out.println("o ���������� ���� ������ ����� Object����� �����ϸ� 0����");
        }
        
    }
    
}
