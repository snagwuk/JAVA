package ch02;

public class ByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		
		int var6 = 128;
		
		var5 = (byte) var6;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);

	}

}
