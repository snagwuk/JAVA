package ch03;

import java.util.Scanner;

public class Exec01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���ڸ� �Է¹޾Ƽ� ����� ���,������ ����, 0�� 0�� ����ϱ�");
		Scanner s1 = new Scanner(System.in);
		
		int num = s1.nextInt();
		//System.out.println(num);
		
		if (num > 0)
		{
			System.out.println(num + "������Դϴ�.");
		}
		if (num < 0)
		{
			System.out.println(num + "�������Դϴ�.");
		}
		if (num == 0)
		{
			System.out.println(num + "��0�Դϴ�.");
		}
		
	}

}
