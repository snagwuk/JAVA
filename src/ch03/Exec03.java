package ch03;

import java.util.Scanner;

public class Exec03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3자리의 정수를 입력 받아 십의 자리를  0으로 만드세요
		System.out.println("세자리 정수를 입력하세요");
		
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		String temp = Integer.toString(num);
		System.out.println(num + " -> " + temp.charAt(0) + "0"+temp.charAt(2));
	}

}

