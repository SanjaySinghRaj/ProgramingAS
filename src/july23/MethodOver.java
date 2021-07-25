package july23;

public class MethodOver {
	public static void pay() {
		System.out.println("case on delivery");
	}
	public static void pay(String usname,String pass ) {
		System.out.println(usname);
		System.out.println(pass);
	}
	public static void pay(int cardnum, String date , int cvi) {
		System.out.println(cardnum);
		System.out.println(date);
		System.out.println(cvi);
	}
	public static void main(String[] args) {
		String usname= "hello";
		String pass = "hello123";
		int cardnum = 123456;
		String date = "10/12" ;
		int cvi = 456;
		System.out.println("case on delivery");
		pay();
		System.out.println("Using net Banking");
		pay(usname, pass);
		System.out.println("Using card");
		pay(cardnum, date, cvi);
	}

}
