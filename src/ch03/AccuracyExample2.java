package ch03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp =  totalPieces - number;
		

		double result = temp/10.0;
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + " ������ ���´�.");
		
		int v1 = 5;
		int v2 = 2;
		double result1 = (double) v1/v2;
		System.out.println("(double) v1/v2 = " + result1 );
		double result2 = (double) (v1/v2);
		System.out.println("(double) (v1/v2) = " + result2 );
	}

}
