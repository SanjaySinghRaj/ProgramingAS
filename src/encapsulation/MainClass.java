package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.setId(10);
		System.out.println(b1.getId());
		b1.setName("Ajay");
		b1.setBal(1000);
		System.out.println(b1.getName());
		System.out.println(b1.getBal());

	}

}
