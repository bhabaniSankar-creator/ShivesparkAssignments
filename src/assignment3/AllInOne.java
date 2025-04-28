package assignment3;


public class AllInOne {

	public static void calculator(String operation, int a, int b) {
		switch (operation) {
		case "add":
			System.out.println("Addition of " + a + " and " + b + ": " + (a + b));
			break;
		case "subtract":
			System.out.println("Subtraction of " + a + " and " + b + ": " + (a - b));
			break;
		case "multiply":
			System.out.println("Multiplication of " + a + " and " + b + ": " + (a * b));
			break;
		case "divide":
			System.out.println("Divsion of " + a + " and " + b + ": " + (a / b));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

	public static String evenOrOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}

	public static int factorial(int num) {
		int result = 1;
		for (int i = num; i >= 1; i--) {
			result = result * i;
		}
		return result;
	}

	public static void fibonacci(int num) {
		int i = 0;
		System.out.print("Series is: " + 0 + " " + 1 + " ");
		for (int j = 1; j <= num - 2; j++) {
			System.out.print(i + j + " ");
			i = j;
		}
	}

	public static void grade(char grade) {
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

	public static int hcf(int a, int b) {
		int hcf = 1;
		int max = a > b ? a : b;

		for (int i = 2; i <= max; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}

	public static void findGender(char gender) {
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

	public static void maxNumber(int a, int b) {

		int choice = a > b ? 1 : b > a ? 2 : 3;
		switch (choice) {
		case 1:
			System.out.println(a + " " + "is maximum");
			break;
		case 2:
			System.out.println(b + " " + "is maximum");
			break;
		case 3:
			System.out.println("Both are equal");
			break;
		default:
			System.out.println("something went wrong");
		}
	}

	public static void multiplicationTable(int a) {
		if (a < 0) {
			System.out.println("Number can't be negative");
			return;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

	public static void findNoOfDays(String month) {
		switch (month) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("31 days");
			break;
		case "April":
		case "June":
		case "Septmber":
		case "November":
			System.out.println("30 days");
			break;
		case "February":
			System.out.println("28 days");
			break;
		default:
			System.out.println("invalid month name");
		}
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int result = 0;
		while (num > 0) {
			int rem = num % 10;
			result = result * 10 + rem;
			num = num / 10;
		}
		return temp == result;
	}

	public static int power(int num, int power) {

		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result * num;
		}
		return result;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverseNumber(int num) {
		int result = 0;
		while (num > 0) {
			int rem = num % 10;
			result = result * 10 + rem;
			num = num / 10;
		}
		return result;
	}

	public static void sumOfNaturalNumbers() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first 10 natural numbers: " + sum);
	}

	public static void voteEligibility(int age) {
		switch (age >= 18 ? 1 : 0) {
		case 1:
			System.out.println("Eligible to vote");
			break;
		case 0:
			System.out.println("Not Eligible to vote");
			break;

		default:
			System.out.println("Invalid choice");
		}
	}

	public static void findVowelOrConsonant(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		default:
			if (c >= 97 && c <= 122) {
				System.out.println("consonant");
			} else {
				System.out.println("invalid choice");
			}
		}
	}

	public static void weekDay(int dayNum) {
		switch (dayNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid choice");
		}
	}
	
	public static int absolute(int num) {
		return num > 0 ? num : (num < 0 ? 0 - num : 0);
	}

	public static String checkLeapYear(int year) {
		return (year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? "Leap Year" : "Not a Leap Year") : "Leap Year")
				: "Not a Leap Year");
	}
	
}
