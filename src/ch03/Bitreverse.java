package ch03;

public class Bitreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int v1 =  10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v1 + ")" );
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v2 + ")" );
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v3 + ")" );
		System.out.println();
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v4 + ")" );
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v5 + ")" );
		System.out.println(toBinaryString(v1) + " (십진수:    )"+ v6 + ")" );
		
		
		
	}

	public static String toBinaryString(int value) {
		// TODO Auto-generated method stub
		String str = Integer.toBinaryString(value);
		//System.out.println("str:"+str);
		while(str.length() < 32)
		{
			str = "0" + str;
		}
		return str;
	}

}
