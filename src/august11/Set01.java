package august11;

import java.util.HashSet;

public class Set01 {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add('a');
		h1.add("abcd");
		h1.add(10);
		h1.add(3.26);
		h1.add(null);
		h1.add(10);
		h1.add('a');
		h1.add(null);
		System.out.println(h1);
		for (Object obj : h1) {
			System.out.println(obj);
		}
	}

}
