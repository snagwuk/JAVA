package ch03;

public class Check4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		// 학생한명이 가지는 연필수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		int va = 356;
		System.out.println(va/100 * 100);

	}

}
