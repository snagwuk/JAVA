package ch02;

public class Operations {
	public static void main(String[] args) 
	{
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		//byte bytevalue3 = bytevalue1 + bytevalue2; 
		int bytevalue3 = bytevalue1 + bytevalue2;
		System.out.println(bytevalue3);
		
		char charval1 = 'A'; char charval2 = 1;
		
		//byte charval3 = charval1 + charal2; 
		int charval3 = charval1 + charval2;
		System.out.println("유니코드 : "  + charval3 );
		System.out.println("문자 : "  + (char)charval3 );
		
	}
}
