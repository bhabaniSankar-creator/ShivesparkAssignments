package assignment1;

public class MultiplicationTable {
	
	public static void multiplicationTable(int a) {
		if (a < 0) {
			System.out.println("Number can't be negative");
			return;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}
	
	
	public static void main(String[] args) {
		multiplicationTable(-19);
	}
}
