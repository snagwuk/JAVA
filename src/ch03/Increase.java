package ch03;

public class Increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		// x =12;
		
		z = x++;
		// z = 12;
		// x = 12 + 1 = 13 
		System.out.println(" * z=" + z);
		System.out.println("x=" + x);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
	
		
		z = ++x;
		System.out.println("z * =" + z);
		System.out.println("x=" + x);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
