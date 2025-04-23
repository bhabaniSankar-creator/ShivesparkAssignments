package assignment2;

public class PositiveNegativeOrZero {
	public static String checkNum(int num) {
		return num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero";
	}
	
	public static void main(String[] args) {
		System.out.println(checkNum(0));
	}
}
