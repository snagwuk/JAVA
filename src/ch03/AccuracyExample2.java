package ch03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp =  totalPieces - number;
		

		double result = temp/10.0;
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면");
		System.out.println(result + " 조각이 남는다.");
		
		int v1 = 5;
		int v2 = 2;
		double result1 = (double) v1/v2;
		System.out.println("(double) v1/v2 = " + result1 );
		double result2 = (double) (v1/v2);
		System.out.println("(double) (v1/v2) = " + result2 );
	}

}
