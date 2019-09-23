package ch03;

public class StringEqals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Ω≈πŒ√∂";
		String str2 = "Ω≈πŒ√∂";
		String str3 = new String("Ω≈πŒ√∂");
		String str4 = new String("Ω≈πŒ√∂");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));

	}

}
