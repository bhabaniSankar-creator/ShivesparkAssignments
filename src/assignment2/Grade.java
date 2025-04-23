package assignment2;

public class Grade {
	
	public static String checkGrade(int score) {
		return score >= 90 ? "A" : score >= 80 ? "B" : "C";
	}
	
	public static void main(String[] args) {
		System.out.println(checkGrade(89));
	}
}
