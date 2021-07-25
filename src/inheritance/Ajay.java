package inheritance;

public class Ajay extends Arun {
	public void bike() {
		super.bike();
		System.out.println("Ajay Ride Two Wheeler");
	}

	public static void main(String[] args) {
		Ajay aj=new Ajay();
		aj.bike();
		
		

	}

}
