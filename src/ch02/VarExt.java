package ch02;

public class VarExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1 = -22;
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		
		System.out.println("b1=" + b1);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		float f =0.1f;
		double d = 10.5;
		System.out.println("f=" +f);
		System.out.println("d=" +d);
		char single = '\'';
		String quote = "Hello \"ghdrlfehd!\"";
		String root = "c:\\";
				
		System.out.println(single);
		System.out.println(quote);
		System.out.println(root);
		System.out.println("서울\t대구\t부산");
		System.out.println("안녕하세요\n이부분은 다음줄에");
		System.out.println("\uD64D\uAE38\uB3D9");
		
	}

}
