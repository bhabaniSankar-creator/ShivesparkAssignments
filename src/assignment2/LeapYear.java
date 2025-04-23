package assignment2;

public class LeapYear {
	
	public static String checkLeapYear(int year) {
		return (year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? "Leap Year" : "Not a Leap Year") : "Leap Year")
				: "Not a Leap Year");
	}
	
	
	public static void main(String[] args) {
		System.out.println(checkLeapYear(2100));
	}
}
