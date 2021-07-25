package abstraction;

public abstract class Test {
	
	public Test() {
		System.out.println("Constructor for Test");
	}
	public void run()
	{
		System.out.println("Running for test");
	}
	public abstract void jump();
	public abstract void jump1();

}
