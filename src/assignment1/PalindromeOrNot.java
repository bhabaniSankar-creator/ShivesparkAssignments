package assignment1;

public class PalindromeOrNot {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int result=0;
		 while(num>0) {
			 int rem=num%10;
			 result=result*10+rem;
			 num=num/10;
		 }
		return temp==result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(131));
	}
}
