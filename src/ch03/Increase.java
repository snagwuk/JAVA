package ch03;

public class Increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		System.out.println("天天天天天天天天天天天天天天天天天天天天天");
		
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println("天天天天天天天天天天天天天天天天天天天天天");
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("天天天天天天天天天天天天天天天天天天天天天");
		
		// x =12;
		
		z = x++;
		// z = 12;
		// x = 12 + 1 = 13 
		System.out.println(" * z=" + z);
		System.out.println("x=" + x);
		System.out.println("天天天天天天天天天天天天天天天天天天天天天");
		
	
		
		z = ++x;
		System.out.println("z * =" + z);
		System.out.println("x=" + x);
		System.out.println("天天天天天天天天天天天天天天天天天天天天天");
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
