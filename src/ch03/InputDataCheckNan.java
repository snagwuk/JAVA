package ch03;

public class InputDataCheckNan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 100.0;
		
		if(Double.isNaN(val))
		{
			System.out.println("NAN�� �ԷµǾ� ó���Ҽ� ����");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
