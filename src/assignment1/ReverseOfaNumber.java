package assignment1;

public class ReverseOfaNumber {
	
	public static int reverseNumber(int num) {
		int result=0;
		 while(num>0) {
			 int rem=num%10;
			 result=result*10+rem;
			 num=num/10;
		 }
		 return result;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(33));
	}
}
