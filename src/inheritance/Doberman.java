package inheritance;

public class Doberman extends Dog {
	String tail="Short";
	int hieght = 2;
	public void bite() {
		System.out.println("Doberman bite");
	}

	public static void main(String[] args) {
		Doberman d1=new Doberman();
		d1.bite();
		d1.bark();
		d1.eat();
		

	}

}
