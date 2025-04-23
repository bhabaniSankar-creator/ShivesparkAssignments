package assignment1;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("enter a character:");
		Scanner sc=new Scanner(System.in);
		char c = sc.next().toLowerCase().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		default:
			if (c>=97 && c<=122) {
				System.out.println("consonant");
			}
			else {
				System.out.println("invalid choice");
			}
		}
	}
}
