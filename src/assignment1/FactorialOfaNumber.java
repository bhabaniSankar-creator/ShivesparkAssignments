package assignment1;

import java.util.Scanner;

public class FactorialOfaNumber {
	
	public static int factorial() {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int result=1;
		for (int i = num; i >=1; i--) {
			result=result*i;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(factorial());
	}
}
