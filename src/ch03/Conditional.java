package ch03;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 91;
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + " = " + grade);

	}

}
