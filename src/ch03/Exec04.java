package ch03;

import java.util.Scanner;

public class Exec04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 값의 절대값구하기
		System.out.println("화면에서 숫자을 입력받아서 절대값을 표현하세요");
		
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		int num2 = (num < 0) ? -num : num;
		
		System.out.println( num +" -> ["+num2 + "]");
		
	}
}
