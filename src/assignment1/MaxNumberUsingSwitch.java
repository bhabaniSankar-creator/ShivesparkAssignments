package assignment1;

public class MaxNumberUsingSwitch {
	
	public static void main(String[] args) {
		int a=310,b=310;
		int choice = a > b ? 1 : b > a ? 2 : 3;
		switch (choice) {
		case 1:
			System.out.println(a+" "+"is maximum");
			break;
		case 2:
			System.out.println(b+" "+"is maximum");
			break;
		case 3:
			System.out.println("Both are equal");
			break;
		default:
			System.out.println("something went wrong");
		}
	}
}
