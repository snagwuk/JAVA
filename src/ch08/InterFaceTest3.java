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
        System.out.println(x +" , " + y + "좌표로 이동");
    }

    @Override
    public void attack(Unit u)
    {
        // TODO Auto-generated method stub
        System.out.println(u + "싸우자");
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
            System.out.println("f가 참조하는 객체는  Fighter객체다.");
        if(fa instanceof Unit)
        {
            System.out.println("f가 참조하는 객체는  Unit객체다.");
            Unit u  = f;
            System.out.println("u 참조변수로 참조 가능한 멤버는 Object멤버를 제외하면 3개다");
            System.out.println(u.currentHp + ","+u.x+","+u.y);
        }
        if(f instanceof Fightable)
        {   
            System.out.println("f가 참조하는 객체는  Fightable객체다.");
            Fightable fa2 = (Fightable)f;
            System.out.println("fa2 참조변수로 참조 가능한 멤버는 Object멤버를 제외하면 3개다");
            System.out.println(fa2.MAX);
            fa2.attack(f);
            fa.move(30, 40);
        }
        if(f instanceof Movable)
        {   
            System.out.println("f가 참조하는 객체는  Movable객체다.");
            Movable m = (Movable)f;
            System.out.println("m 참조변수로 참조 가능한 멤버는 Object멤버를 제외하면 2개다");
            System.out.println(m.MAX);
            fa.move(30, 40);
        }
        if(f instanceof Attackable)
        {   
            System.out.println("f가 참조하는 객체는  Attackable객체다.");
            Attackable a = (Attackable)f;
            System.out.println("m 참조변수로 참조 가능한 멤버는 Object멤버를 제외하면 1개다");

            a.attack(f);
        }
        if(f instanceof Object)
        {
            System.out.println("f가 참조하는 객체는  Object객체다.");
            Object o = (Object)f;
            System.out.println("o 참조변수로 참조 가능한 멤버는 Object멤버를 제외하면 0개다");
        }
        
    }
    
}
