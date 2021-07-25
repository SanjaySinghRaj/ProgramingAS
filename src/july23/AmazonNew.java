package july23;

public class AmazonNew implements Amazon1,Amazon2{

	@Override
	public void payment() {
		System.out.println("Done your Payment");
		
	}

	@Override
	public void deliver() {
		System.out.println("Deliverd  your Product as soon as Possible");
		
	}

	@Override
	public void login() {
		System.out.println("Login Successfully");
		
	}

	@Override
	public void search() {
		System.out.println("Search Your Product ");
		
	}

	@Override
	public void order() {
		System.out.println("Your Order Successfully Orderd");
		
	}

}
