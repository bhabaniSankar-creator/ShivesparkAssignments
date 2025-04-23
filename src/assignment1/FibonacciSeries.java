package assignment1;

public class FibonacciSeries {
	
	public static void fibonacci(int num) {
		int i=0;
		System.out.print("Series is: "+0+" "+1+" ");
		for (int j = 1; j <= num-2; j++) {
			System.out.print(i+j+" ");
			i=j;
		}
	}
	
	
	public static void main(String[] args) {
		fibonacci(7);
	}
}
