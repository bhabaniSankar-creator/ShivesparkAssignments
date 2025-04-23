package assignment1;

public class MaleFemale {
	public static void main(String[] args) {
		char gender='f';
		switch (gender) {
		case 'm':
			System.out.println("Male");
			break;
		case 'f':
			System.out.println("Female");
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}
