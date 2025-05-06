package practice;

 interface InterestRate {
	public double sbiInterestRate();
	public double axisInterestRate();
	public double pnbInerestRate();
}

abstract class SbiInterest implements InterestRate{
	@Override
	public double sbiInterestRate() {
		
		return 7.8;
	}
}

abstract class AxisInterest implements InterestRate{
	@Override
	public double axisInterestRate() {
		return 6.8;
	}
}
abstract class PnbInterest implements InterestRate{
	@Override
	public double pnbInerestRate() {
		
		return 9.0;
	}
}

class SbiBank extends SbiInterest{

	@Override
	public double axisInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pnbInerestRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class AxisBank extends AxisInterest{

	@Override
	public double sbiInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pnbInerestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

class PnbBank extends PnbInterest{

	@Override
	public double sbiInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double axisInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class TestInterestRate{
	public static void main(String[] args) {
		InterestRate axis=new AxisBank();
		System.out.println(axis.axisInterestRate());
		
		InterestRate pnb=new PnbBank();
		System.out.println(pnb.pnbInerestRate());
		
		InterestRate sbi=new SbiBank();
		System.out.println(sbi.sbiInterestRate());
	}
}


