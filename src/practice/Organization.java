package practice;

public interface Organization {
	public void sellProduct();
	public void developProduct();
	public void humanResource();
	
}

abstract class SalesTeam implements Organization{
	
	@Override
	public void sellProduct() {
		System.out.println("All products are sold");
	}
}
abstract class Developer implements Organization{
	
	@Override
	public void developProduct() {
		System.out.println("Product development will be completed soon");
	}
}

abstract class HR implements Organization{
	
	@Override
	public void humanResource() {
		System.out.println("We are taking care of our employees");
	}
}

class Sales extends SalesTeam{

	@Override
	public void developProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void humanResource() {
		// TODO Auto-generated method stub
		
	}

	
	
}


