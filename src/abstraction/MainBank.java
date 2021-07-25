package abstraction;

public class MainBank {

	public static void main(String[] args) {
		Bank b1=new SBI();
		Bank b2=new HDFC();
		System.out.println(b1.getInterest());
		System.out.println(b2.getInterest());

	}

}
