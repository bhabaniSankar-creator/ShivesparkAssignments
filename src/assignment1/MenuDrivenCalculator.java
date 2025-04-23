package assignment1;

import java.util.Scanner;

public class MenuDrivenCalculator {
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		System.out.println("Enter your choice:");
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
			break;
		case 2:
			System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
			break;
		case 3:
			System.out.println(firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
			break;
		case 4:
			System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}
