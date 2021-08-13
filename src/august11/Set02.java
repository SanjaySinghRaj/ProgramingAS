package august11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Set02 {

	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(10);
		h1.add(3);
		h1.add(16);
		h1.add(35);
		h1.add(20);
		h1.add(23);
		
		System.out.println(h1);
		
		ArrayList a1 = new ArrayList();
		a1.addAll(h1);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);

	}

}
