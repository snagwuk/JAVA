package ch03;

import java.util.Scanner;

public class Exec02 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		int h = num / 3600;
		int m = (num % 3600) / 60;
		int s = (num % 3600) % 60;
		
		System.out.println(h + "�ð�"+  m +"��"+ s+ "��");
		
	}

}
