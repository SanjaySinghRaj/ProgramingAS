package august09;

public class TestUnBoxing {

	public static void main(String[] args) {
		Integer i1 = new Integer(20);// non primitive 
		
		int i2=i1.intValue();// un boxing
		System.out.println(i2);
		
		int i3=i1;// auto unboxing
		System.out.println(i3);

	}

}
