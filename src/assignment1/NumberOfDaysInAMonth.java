package assignment1;

public class NumberOfDaysInAMonth {
	public static void main(String[] args) {
		String month="July";
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
}
