package ch03;

public class InfinityAndNaNCheck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*int x = 5;
		double y= 2.0;
		
		//double z = x / y;
		double z = x % y;
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(":" + z);

		if (Double.isInfinite(z) || Double.isNaN(z))
		{
			System.out.println("갑 산출 불가");
		}
		else
				System.out.println(z+2);
		*/
		int x = 5;
		int y= 2;
		try{
			//double z = x / y;
			double z = x % y;
			System.out.println("z : " + z);
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
		
		
		
		
	}

}
