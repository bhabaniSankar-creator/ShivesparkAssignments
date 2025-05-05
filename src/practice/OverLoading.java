package practice;

public class OverLoading {
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();
		System.out.println(overLoading.add(3, 2));
		System.out.println(overLoading.add(3, 2, 8));
	}
}
