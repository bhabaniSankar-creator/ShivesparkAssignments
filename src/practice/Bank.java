package practice;

public interface Bank {
	public double getInterestRate();
}
class Icici implements Bank{

	@Override
	public double getInterestRate() {
		
		return 7.8;
	}
	
}
class Pnb implements Bank{

	@Override
	public double getInterestRate() {
		
		return 6.5;
	}
	
}
class Sbi implements Bank{

	@Override
	public double getInterestRate() {
		
		return 8.0;
	}
	
}

class Test{
	public static void main(String[] args) {
		Bank sbi = new Sbi();
		System.out.println("Sbi interest rate is :"+sbi.getInterestRate());
		Bank pnb = new Pnb();
		System.out.println("Pnb interest rate is :"+pnb.getInterestRate());
		Bank icici = new Icici();
		System.out.println("Icici interest rate is :"+icici.getInterestRate());
	}
}
