package abstraction;

public class Demo extends Test{
	
	public Demo(){
		super();
		System.out.println("Constructor for Demo");
	}

	@Override
	public void jump() {
		System.out.println("Jumping for test");
		
	}
	@Override
	public void run() {
		System.out.println("Running for test");
	}

	@Override
	public void jump1() {
		System.out.println("Jumping 2 for test");
		
	}
	

}
