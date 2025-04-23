package assignment2;

public class AbsoluteValue {
	
	public static int absolute(int num) {
		return num > 0 ? num : (num < 0 ? 0 - num : 0);
	}
	
	public static void main(String[] args) {
		System.out.println(absolute(0));
	}
}
