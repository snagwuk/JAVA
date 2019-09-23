package ch03;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int result = safeAdd(20,10);
			System.out.println(	result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우 발생 계싼 불가");
		}
	}

	public static int safeAdd(int left, int right) {
		// TODO Auto-generated method stub
		if ((right<0))
		{
			if (left>(Integer.MAX_VALUE - right))
			{
				throw new ArithmeticException("오버플로우 발생");
				
			}
		}
			else 
			{
				if (left<(Integer.MIN_VALUE - right))
				{
					throw new ArithmeticException("오버플로우 발생");
				}
			}
				
		
		return left + right;
	}

}
