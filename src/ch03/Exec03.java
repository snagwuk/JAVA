package ch03;

import java.util.Scanner;

public class Exec03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3�ڸ��� ������ �Է� �޾� ���� �ڸ���  0���� ���弼��
		System.out.println("���ڸ� ������ �Է��ϼ���");
		
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		String temp = Integer.toString(num);
		System.out.println(num + " -> " + temp.charAt(0) + "0"+temp.charAt(2));
	}

}

