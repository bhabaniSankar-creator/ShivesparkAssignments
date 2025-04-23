package assignment2;

public class GreaterNumber {
	
	public static String greater(int a,int b) {
		return a > b ? a + " is greater" : b > a ? b + " is greater" : "Both are equal";
	}
	
	public static void main(String[] args) {
		System.out.println(greater(1, 40));
	}
}
