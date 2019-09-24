package ch03;

import java.util.Scanner;

public class Exec01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력받아서 양수면 양수,음수면 음수, 0인 0을 출력하기");
		Scanner s1 = new Scanner(System.in);
		
		int num = s1.nextInt();
		//System.out.println(num);
		
		if (num > 0)
		{
			System.out.println(num + "은양수입니다.");
		}
		if (num < 0)
		{
			System.out.println(num + "은음수입니다.");
		}
		if (num == 0)
		{
			System.out.println(num + "은0입니다.");
		}
		
	}

}
