package august09;

import java.util.ArrayList;

public class ArraytestList01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		System.out.println(a1.size());
		a1.add(10);
		//a1.add('a');
		//a1.add("Sanjay");
		//a1.add(true);
		//a1.add(3.75);
		//a1.add(0, "hello");
		a1.add(null);
		System.out.println(a1);
		//a1.remove(3);
		System.out.println(a1);
		//a1.set(3, false);
		System.out.println(a1);
		/*for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}*/
		

	}

}
