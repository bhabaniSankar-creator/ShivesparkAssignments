package assignment1;

public class Calculator {
	public static void main(String[] args) {
		String operation="multiply";
		int a=23,b=43;
		
		switch (operation) {
		case "add":
			System.out.println("Addition of "+a+" and "+b+": "+(a+b));
			break;
		case "subtract":
			System.out.println("Subtraction of "+a+" and "+b+": "+(a-b));
			break;
		case "multiply":
			System.out.println("Multiplication of "+a+" and "+b+": "+(a*b));
			break;
		case "divide":
			System.out.println("Divsion of "+a+" and "+b+": "+(a/b));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}
}
