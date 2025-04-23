package assignment1;

public class GradeRemark {
	public static void main(String[] args) {
		char grade='A';
		switch (grade) {
		case 'A':
            System.out.println("Excellent");
            break;
        case 'B':
            System.out.println("Very Good");
            break;
        case 'C':
            System.out.println("Good");
            break;
        case 'D':
            System.out.println("Average");
            break;
        case 'F':
            System.out.println("Fail");
            break;
		default:
			System.out.println("Invalid Grade");
		}
	}
}
