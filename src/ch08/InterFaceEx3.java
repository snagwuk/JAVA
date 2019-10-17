package ch08;

import java.sql.Ref;

interface Repairable{}
interface ReFundable{}
class Unit2 
{
    int hp;
    final int MAX_HP;
    public Unit2(int hp)
    {
        // TODO Auto-generated constructor stub
        this.hp = hp; 
        MAX_HP =hp;
    }
}
class AirUnit extends Unit2
{
    public AirUnit(int hp)
    {
        super(hp);
        // TODO Auto-generated constructor stub
    }
}
class GroundUnit extends Unit2
{
    public GroundUnit(int hp)
    {
        super(hp);
        // TODO Auto-generated constructor stub
    }
}
class Tank extends GroundUnit implements Repairable
{
    public Tank()
    {
        // TODO Auto-generated constructor stub
        super(150);
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Tank";
    }
}
class DropShip extends AirUnit implements Repairable,ReFundable
{
    public DropShip()
    {
        // TODO Auto-generated constructor stub
        super(125);
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "DropShip";
    }
}
class Marine extends GroundUnit implements ReFundable
{
    public Marine()
    {
        // TODO Auto-generated constructor stub
        super(40);
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Marine";
    }
}
class SCV extends GroundUnit implements Repairable
{
    public SCV()
    {
        // TODO Auto-generated constructor stub
        super(60);
    }
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "SCV";
    }
    void repair (Repairable r)
    {
        if(r instanceof Unit2)
        {
            Unit2 u = (Unit2) r;
            u.hp = u.MAX_HP;
            System.out.println(r + "수리완료");
        }
    }
    void refund (ReFundable f)
    {
        System.out.println(f + "반품");
    }
    
}
public class InterFaceEx3
{
    public static void main(String[] args)
    {
        Tank t = new Tank();
        DropShip d = new DropShip();
        Marine m = new Marine();
        SCV s = new SCV();
        s.repair(t);
        s.repair(d);
        s.refund(d);
        
    }
}
