package assignment1;

public class EvenOddUsingSwitch {
	public static void main(String[] args) {
		int num=7;
		switch (num%2) {
		case 0:
			System.out.println("Even");
			break;
		default:
			System.out.println("Odd");
		}
	}
}
