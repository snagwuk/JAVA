package ch03;

public class StringEqals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "�Ź�ö";
		String str2 = "�Ź�ö";
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));

	}

}
