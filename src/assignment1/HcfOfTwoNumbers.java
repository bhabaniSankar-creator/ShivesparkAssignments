package assignment1;

public class HcfOfTwoNumbers {
	
	
	  public static int hcf(int a,int b) {
		  int hcf=1;
		 int max=a > b ? a : b;
		  
		  for (int i = 2; i <= max; i++) {
			if (a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		  return hcf;
	  }
	 
	
	public static void main(String[] args) {
		System.out.println("Hcf = "+hcf(10, 10));
	}
}
