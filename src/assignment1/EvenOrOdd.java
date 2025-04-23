package assignment1;

public class EvenOrOdd {
	
	public static String evenOrOdd(int num) {
		if (num%2==0) {
			return "Even";
		}
		return "Odd";
	}
	
	public static void main(String[] args) {
		System.out.println(evenOrOdd(21));
	}
}
