package ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'A'; 
		int value = 6;
		
		if ((charCode >= 65) & (charCode<=90))
		{
			System.out.println("�빮�� �̱���");
		}
		if ((charCode >=97) && (charCode<=122))
		{
			System.out.println("�ҹ��� �̱���");
		}
		if (!(charCode < 48) && !(charCode>57))
		{
			System.out.println("0~9 ���� �̱���");
		}
		if ((value % 2 == 0) | (value % 3 == 0))
		{
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}
		if ((value % 2 == 0) || (value % 3 == 0))
		{
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}
		
		
	}

}
