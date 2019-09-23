package ch03;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int result = safeAdd(20,10);
			System.out.println(	result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο� �߻� ��� �Ұ�");
		}
	}

	public static int safeAdd(int left, int right) {
		// TODO Auto-generated method stub
		if ((right<0))
		{
			if (left>(Integer.MAX_VALUE - right))
			{
				throw new ArithmeticException("�����÷ο� �߻�");
				
			}
		}
			else 
			{
				if (left<(Integer.MIN_VALUE - right))
				{
					throw new ArithmeticException("�����÷ο� �߻�");
				}
			}
				
		
		return left + right;
	}

}
