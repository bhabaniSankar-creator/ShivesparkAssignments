package assignment1;

public class Vote {
	public static void main(String[] args) {
		int age=5;
		switch (age >= 18 ? 1 : 0) {
		case 1:
			System.out.println("Eligible to vote");
			break;
		case 0:
			System.out.println("Not Eligible to vote");
			break;

		default:
			System.out.println("Invalid choice");
		}
	}
}
