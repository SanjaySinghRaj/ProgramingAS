package august10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList01 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add(9);
		System.out.println(a1);
		/*Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);*/
		ArrayList a2 = new ArrayList();
		a2.add(7);
		a2.add(15);
		a2.add(6);
		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2);
		a2.removeAll(a1);
		a2.add(a1);
		System.out.println(a2);

	}

}
