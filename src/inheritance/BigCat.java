package inheritance;

public class BigCat extends Animal {
	int height=2;
	int weight=50;
	String nature="cruel";
	
	public void jump() {
		System.out.println("cat jumps");
	}
	public void hunt() {
		System.out.println("cat hunts");
	}

	public static void main(String[] args) {
		BigCat b1=new BigCat();
		System.out.println(b1.lag);
		System.out.println(b1.height);
		b1.eat();

	}

}
