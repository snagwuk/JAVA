package ch03;

import java.util.Scanner;

public class Exec04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է¹��� ���� ���밪���ϱ�
		System.out.println("ȭ�鿡�� ������ �Է¹޾Ƽ� ���밪�� ǥ���ϼ���");
		
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		int num2 = (num < 0) ? -num : num;
		
		System.out.println( num +" -> ["+num2 + "]");
		
	}
}
