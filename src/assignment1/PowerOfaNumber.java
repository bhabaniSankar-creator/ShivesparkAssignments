package assignment1;


public class PowerOfaNumber {
	public static int power(int num,int power) {
		
		int result=1;
		for (int i = 1; i <=power; i++) {
			result=result*num;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(power(2,6));
	}
}
