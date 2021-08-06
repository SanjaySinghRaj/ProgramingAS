package august05;

public class DemoEc01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ashish love oyo");
		}
		catch (ArithmeticException e) {
			System.out.println("Ashish is shat");
		}
		finally {
			
		}
		
		System.out.println(4);
		System.out.println(5);
        System.out.println("Printing is Done");
	}

}
