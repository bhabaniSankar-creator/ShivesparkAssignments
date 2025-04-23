package assignment2;

public class Smallest {
	
	public static int checkSmallest(int a,int b, int c) {
		return a < b ? (a < c ? a : c) : (b < c ? b : c);
	}
	
	public static void main(String[] args) {
		System.out.println(checkSmallest(118, 70, 110));
	}
}
