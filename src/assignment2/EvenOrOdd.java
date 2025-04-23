package assignment2;

public class EvenOrOdd {
	
	public static String evenOrOdd(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
	
	public static void main(String[] args) {
		System.out.println(evenOrOdd(5));
	}
}
