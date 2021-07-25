package abstraction;

public class Frog implements Terestrial,Aquatic {

	public static void main(String[] args) {
		Frog f1=new Frog();
		f1.jump();
		f1.swim();
		Aquatic.speed();
		Terestrial.speed();

	}

	@Override
	public void swim() {
		System.out.println("Frog is Swim");
		
	}

	@Override
	public void jump() {
		System.out.println("Frog is Jump");
	}

}
